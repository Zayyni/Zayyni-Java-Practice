package com.zayyni.springboot1;

import com.zayyni.springboot1.service.Zayyni;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBoot1Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBoot1Application.class, args);
        Zayyni zayyni=context.getBean(Zayyni.class);
        zayyni.display();
        context.close();
    }

}
