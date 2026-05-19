package com.zayyni.springboot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot1Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBoot1Application.class, args);

        
        Dev dev = context.getBean(Dev.class);
        dev.build();
    }

}
