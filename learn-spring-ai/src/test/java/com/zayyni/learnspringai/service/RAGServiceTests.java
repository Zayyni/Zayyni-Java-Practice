package com.zayyni.learnspringai.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
public class RAGServiceTests {

    @Autowired
    private RAGService ragService;

    @Test
    public void testIngest() {
        ragService.ingestPdfToVectorStore();
    }

    @Test
    public void testAskAI() {
        var response = ragService.askAI("Maecenas tincidunt est efficitur ligula euismod");
        System.out.println(response);
    }

}