package com.zayyni.learnspringai.dto;

public record Joke (
    String text,
    String category,
    Double laughScore,
    Boolean isNSFW
)
{

}
