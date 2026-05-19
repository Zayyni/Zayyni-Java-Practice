package com.zayyni.springboot1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
@Service
public class GreetingsService implements IGreetings {

    public GreetingsService() {
        System.out.println("GreetingsService Bean Created");
    }
    @Autowired
    private LocalTime time;
    public String generateWish(String name) {
        int hour = time.getHour();
        if (hour < 12) {
            return "Good Morning " + name ;
        }
        else if (hour == 12) {
            return "Good Afternoon " + name ;
        }
        else {
            return "Good Evening " + name ;
        }
    }
}
