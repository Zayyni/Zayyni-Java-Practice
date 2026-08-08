package com.zayyni.module1introduction;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Module1IntroductionApplication implements CommandLineRunner {

    final NotificationService notificationService;

    public Module1IntroductionApplication(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public static void main(String[] args) {
        SpringApplication.run(Module1IntroductionApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        notificationService.send();
    }
}
