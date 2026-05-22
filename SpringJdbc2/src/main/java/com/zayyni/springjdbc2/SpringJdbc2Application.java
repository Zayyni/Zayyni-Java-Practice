package com.zayyni.springjdbc2;

import com.zayyni.springjdbc2.dao.EmployeeDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringJdbc2Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext container=SpringApplication.run(SpringJdbc2Application.class, args);
//        EmployeeDao dao=container.getBean(EmployeeDao.class);
//        dao.input();
    }

}
