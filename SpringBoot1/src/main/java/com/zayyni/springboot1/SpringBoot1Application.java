package com.zayyni.springboot1;

import com.zayyni.springboot1.service.GreetingsService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot1Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBoot1Application.class, args);


        GreetingsService greetingsService=context.getBean(GreetingsService.class);
        String status = greetingsService.generateWish("Zayyni");
        System.out.println(status);
    }

}
