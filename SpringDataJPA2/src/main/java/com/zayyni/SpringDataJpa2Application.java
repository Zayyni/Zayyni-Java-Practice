package com.zayyni;

import com.zayyni.entity.Vaccine;
import com.zayyni.service.VaccineService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringDataJpa2Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext container=SpringApplication.run(SpringDataJpa2Application.class, args);
        VaccineService service=container.getBean(VaccineService.class);
//        String status=service.registerVaccineInfo(new Vaccine("Phizer","Moderena",686.56));
//        System.out.println(status);

//        Vaccine vaccine1 = new Vaccine("Polio","WHO",55.4);
//        Vaccine vaccine2 = new Vaccine("Molia","EHZ",505.4);
//        Vaccine vaccine3 = new Vaccine("LiDer","PETHX",102.4);
//        List<Vaccine> vaccines= new ArrayList<>();
//        vaccines.add(vaccine1);
//        vaccines.add(vaccine2);
//        vaccines.add(vaccine3);
//        service.registerMultipleVaccineInfo(vaccines).forEach(System.out::println);

        Long count = service.vaccineCount();
        System.out.println("Number of vaccines available : "+count);

        boolean status = service.checkVaccineAvailability(2);
        System.out.println("Vaccine availability : "+status);


    }

}
