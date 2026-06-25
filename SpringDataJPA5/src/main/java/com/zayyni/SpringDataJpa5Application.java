package com.zayyni;

import com.zayyni.service.VaccineService;
import com.zayyni.view.ResultView;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringDataJpa5Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =SpringApplication.run(SpringDataJpa5Application.class, args);
        VaccineService service =context.getBean(VaccineService.class);
        List<ResultView> resultViews = service.fetchByCost(5.0);
        for (ResultView resultView : resultViews) {
            System.out.println(resultView);
        }
    }

}
