package com.zayyni.module1introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class Module1IntroductionApplication implements CommandLineRunner {

//    final NotificationService notificationService;
//
//    public Module1IntroductionApplication(NotificationService notificationService) {
//        this.notificationService = notificationService;
//    }

    @Autowired
    Map<String,NotificationService> notificationServiceMap = new HashMap<>();
    public static void main(String[] args) {
        SpringApplication.run(Module1IntroductionApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        notificationService.send();
        for (String key : notificationServiceMap.keySet()) {
            NotificationService notificationService = notificationServiceMap.get(key);
            notificationService.send();
        }
    }
}
