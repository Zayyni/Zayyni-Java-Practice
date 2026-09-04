package com.zayyni.learnspringai.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AIServiceTests {

    @Autowired
    private AIService aiService;



    @Test
    public void testGetJoke() {
       var joke = aiService.getJoke("Dogs");
       System.out.println(joke);
    }

    @Test
    public void testEmbeddedText() {
        var embed = aiService.getEmbedding("This is a test text");
        System.out.println(embed.length);
        for (float embedding : embed) {
            System.out.print(embedding + " ");
        }
    }


    @Test
    public void testIngestDataToVectorStore() {
        aiService.ingestDataToVectorStore();
    }

    @Test
    public void testSimilaritySearch() {
        var response = aiService.similaritySearch("space movie");
        for (var result : response) {
            System.out.println(result);
        }
    }
}
