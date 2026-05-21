package com.zayyni.springjdbc;

import com.zayyni.springjdbc.dao.EmployeeDaoImpl;
import com.zayyni.springjdbc.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcApplication {

    public static void main(String[] args) {
       ApplicationContext container=SpringApplication.run(SpringJdbcApplication.class, args);
       EmployeeDaoImpl dao = container.getBean(EmployeeDaoImpl.class);


//       List<Employee> list =dao.getEmployeesInfo();
//       for (Employee employee : list) {
//           System.out.println(employee);
//       }

        dao.getEmployeesInfo().forEach(System.out::println);
    }

}
