package com.zayyni;

import com.zayyni.entity.Vaccine;
import com.zayyni.service.VaccineService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringDataJpa4Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpa4Application.class, args);
        VaccineService vaccineService = container.getBean(VaccineService.class);
        Vaccine vaccine =vaccineService.searchVaccineById(1);
        System.out.println(vaccine);

        Vaccine example = new Vaccine();
        List<Vaccine> vaccines =
                vaccineService.searchVaccineByGivenInfo(
                        example,
                        true,
                        "vaccineName"
                );

        vaccines.forEach(System.out::println);














    }

}
