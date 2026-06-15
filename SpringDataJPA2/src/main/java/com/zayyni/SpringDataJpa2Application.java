package com.zayyni;

import com.zayyni.entity.Vaccine;
import com.zayyni.service.VaccineService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDataJpa2Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext container=SpringApplication.run(SpringDataJpa2Application.class, args);
        VaccineService service=container.getBean(VaccineService.class);
        String status=service.registerVaccineInfo(new Vaccine("Phizer","Moderena",686.56));
        System.out.println(status);
    }

}
