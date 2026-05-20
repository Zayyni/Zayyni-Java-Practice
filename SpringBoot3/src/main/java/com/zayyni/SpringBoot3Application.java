package com.zayyni;

import com.zayyni.service.Amazon;
import com.zayyni.service.IDelivery;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBoot3Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext container=SpringApplication.run(SpringBoot3Application.class, args);
        Amazon amazon=container.getBean(Amazon.class);
        Boolean status = amazon.deliverProduct(566.66);
        if (status) {
            System.out.println("Product delivered");
        }
        else {
            System.out.println("Product not delivered");
        }
    }

}
