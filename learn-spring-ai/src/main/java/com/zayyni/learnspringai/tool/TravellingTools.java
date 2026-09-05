package com.zayyni.learnspringai.tool;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Service;

@Service
public class TravellingTools {

    @Tool(description = "Get the weather of a city")
    public String getWeather(@ToolParam(description = "City name for which to get the weather information") String city) {
        return switch (city) {
            case "Lahore" -> "Cloudy, 26 Degrees";
            case "Karachi" -> "Sunny";
            default -> "Unknown";
        };
    }
}
