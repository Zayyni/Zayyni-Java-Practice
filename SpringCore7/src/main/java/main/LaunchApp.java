package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sevices.Employee;

public class LaunchApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee  emp=context.getBean(Employee.class);
        System.out.println(emp);
        System.out.println(emp.employeeTask());

    }
}
