package com.zayyni.learnspringai.service;

import com.zayyni.learnspringai.dto.Joke;
import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.SimpleLoggerAdvisor;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.ai.document.Document;
import org.springframework.ai.embedding.EmbeddingModel;
import org.springframework.ai.vectorstore.SearchRequest;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AIService {

    private final ChatClient chatClient;
    private final EmbeddingModel embeddingModel;
    private final VectorStore vectorStore;




    public void ingestDataToVectorStore() {
        List<Document> movies = List.of(
                new Document(
                        "A thief who steals corporate secrets through dream-sharing technology is given the task of planting an idea into someone's mind.",
                        Map.of(
                                "title", "Inception",
                                "genre", "Science Fiction",
                                "year", 2010
                        )
                ),
                new Document(
                        "A young wizard discovers his magical heritage and attends a school of witchcraft and wizardry.",
                        Map.of(
                                "title", "Harry Potter and the Philosopher's Stone",
                                "genre", "Fantasy",
                                "year", 2001
                        )
                ),
                new Document(
                        "A computer programmer discovers that reality is a simulated world and joins a rebellion against its creators.",
                        Map.of(
                                "title", "The Matrix",
                                "genre", "Science Fiction",
                                "year", 1999
                        )
                ),
                new Document(
                        "A young lion prince must overcome tragedy and reclaim his rightful place as king of the Pride Lands.",
                        Map.of(
                                "title", "The Lion King",
                                "genre", "Animation",
                                "year", 1994
                        )
                ),
                new Document(
                        "A team of astronauts travels through a wormhole in space in search of a new home for humanity.",
                        Map.of(
                                "title", "Interstellar",
                                "genre", "Science Fiction",
                                "year", 2014
                        )
                )
        );

        vectorStore.add(movies);
    }


    public List<Document> similaritySearch(String query) {
        return vectorStore.similaritySearch(SearchRequest.builder()
                        .query(query)
                        .topK(2)
                        .similarityThreshold(0.3)
                .build());
    }


    public float[] getEmbedding(String text){
        return embeddingModel.embed(text);
    }


    public String getJoke(String topic){


        String systemPrompt = """
            You are a sarcastic joker, give response in 4 line only.
            You don't make jokes about politics.
            Give a joke on the topic: {topic}
            """;

        PromptTemplate promptTemplate = new PromptTemplate(systemPrompt);
        String renderedText = promptTemplate.render(Map.of("topic", topic));


        var response = chatClient.prompt()
                .user(renderedText)
                .advisors(
                        new SimpleLoggerAdvisor()
                )
                .call()
                .entity(Joke.class);

        return response.text();
        }
}
