package com.zayyni.main.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    public Config(){
        System.out.println("Config bean is created");
    }

    @Bean
    public Password createPasswordBean(){
        Password password=new Password("SHA");
        return password;
    }
}
