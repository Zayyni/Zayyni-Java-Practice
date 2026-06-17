package com.zayyni;

import com.zayyni.entity.Vaccine;
import com.zayyni.service.VaccineService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDataJpa3Application {

    public static void main(String[] args) {
       ConfigurableApplicationContext container=SpringApplication.run(SpringDataJpa3Application.class, args);
       VaccineService vaccineService=container.getBean(VaccineService.class);
//       vaccineService.fetchDetailsBySorting(true,"vaccineName","vaccineCompany")
//               .forEach(System.out::println);

//        vaccineService.fetchDetailsByPagination(1, 2, true, "vaccineName")
//                .forEach(System.out::println);

        vaccineService.fetchDetailsByPagination(2);



    }

}
