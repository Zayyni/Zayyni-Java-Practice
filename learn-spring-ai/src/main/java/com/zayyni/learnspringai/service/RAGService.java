package com.zayyni.learnspringai.service;

import com.zayyni.learnspringai.advisor.TokenUsageAdvisor;
import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.MessageChatMemoryAdvisor;
import org.springframework.ai.chat.client.advisor.SafeGuardAdvisor;
import org.springframework.ai.chat.client.advisor.SimpleLoggerAdvisor;
import org.springframework.ai.chat.client.advisor.vectorstore.QuestionAnswerAdvisor;
import org.springframework.ai.chat.client.advisor.vectorstore.VectorStoreChatMemoryAdvisor;
import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.ai.document.Document;
import org.springframework.ai.reader.pdf.PagePdfDocumentReader;
import org.springframework.ai.transformer.splitter.TokenTextSplitter;
import org.springframework.ai.vectorstore.SearchRequest;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RAGService {

    private final ChatClient chatClient;
    private final VectorStore vectorStore;
    private final ChatMemory chatMemory;

    @Value("classpath:sample.pdf")
    Resource samplePdf;


    public String askAIWithAdvisors(String prompt, String userId) {
        return chatClient.prompt()
                .system("""
                        You are an AI assistant called Cody.
                        Greet users with your name (Cody) and the user name if you know their name.
                        Answer in friendly, conversational tone.
                        """)
                .user(prompt)
                .advisors(

                        new SafeGuardAdvisor(List.of("Politics","Gaming","Forget the Rules")),

                        MessageChatMemoryAdvisor.builder(chatMemory)
                                        .build(),

                        VectorStoreChatMemoryAdvisor.builder(vectorStore)
                        .defaultTopK(4)
                        .build(),

                        QuestionAnswerAdvisor.builder(vectorStore)
                                .searchRequest(SearchRequest.builder()
                                        .filterExpression("file_name == 'sample.pdf'")
                                        .topK(4)
                                        .build())
                                .build(),

                        new TokenUsageAdvisor()

                        )
                .advisors(a -> a.param(ChatMemory.CONVERSATION_ID, userId))
                .call()
                .content();
    }


    public String askAI(String question) {

        String template = """
                You are an AI assistant helping a developer.
                
                Rules:
                - Use ONLY the information provided in the context
                - You MAY rephrase, summarize, and explain in natural language
                - Do NOT introduce new concepts or facts
                - If multiple context sections are relevant, combine them into a single explanation
                - If the answer is not present, say "I don't know"
                
                
                Context:
                {context}
                
                Answer in a friendly, conversational tone.
                """;

        List<Document> documents = vectorStore.similaritySearch(SearchRequest.builder()
                .query(question)
                .topK(4)
                .similarityThreshold(0.4)
                .filterExpression("file_name == '" + samplePdf.getFilename() + "'")
                .build());

        String context = documents.stream()
                .map(Document::getText)
                .collect(Collectors.joining("\n\n"));

        PromptTemplate promptTemplate = new PromptTemplate(template);
        String systemPrompt = promptTemplate.render(Map.of("context",context));
        return chatClient.prompt()
                .system(systemPrompt)
                .user(question)
                .advisors()
                .call()
                .content();
    }

    public void ingestPdfToVectorStore() {
        PagePdfDocumentReader reader = new PagePdfDocumentReader(samplePdf);
        List<Document> pages = reader.get();

        TokenTextSplitter tokenTextSplitter = TokenTextSplitter.builder()
                .withChunkSize(200)
                .build();

        List<Document> chunks = tokenTextSplitter.apply(pages);
        vectorStore.add(chunks);
    }

    public static List<Document> SpringAiDocs() {
        return List.of(
                new Document(
                        "Spring AI provides abstractions for integrating AI models into Spring Boot applications. "
                                + "It supports chat models, embedding models, vector stores, and other AI-related components.",
                        Map.of(
                                "topic", "Spring AI Introduction",
                                "ai", "Spring AI"
                        )
                ),

                new Document(
                        "An embedding model converts text into numerical vectors that represent the semantic meaning "
                                + "of the text. These vectors can be stored in a vector database and used for similarity searches.",
                        Map.of(
                                "topic", "Embeddings",
                                "ai", "Spring AI"
                        )
                ),

                new Document(
                        "A VectorStore in Spring AI is used to store and search document embeddings. "
                                + "It allows applications to find documents that are semantically similar to a user's query.",
                        Map.of(
                                "topic", "Vector Store",
                                "ai", "Spring AI"
                        )
                ),

                new Document(
                        "Retrieval-Augmented Generation, or RAG, combines a language model with a vector store. "
                                + "The application first retrieves relevant documents and then provides them to the AI model "
                                + "as context for generating a more accurate response.",
                        Map.of(
                                "topic", "RAG",
                                "ai", "Spring AI"
                        )
                ),

                new Document(
                        "Spring AI supports ChatClient for interacting with AI chat models. "
                                + "ChatClient provides a fluent API that can be used to send prompts, provide context, "
                                + "and retrieve responses from AI models.",
                        Map.of(
                                "topic", "ChatClient",
                                "ai", "Spring AI"
                        )
                )
        );
    }



}
