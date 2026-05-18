package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sevices.Employee;

public class LaunchApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee  emp1=context.getBean(Employee.class);
        System.out.println(emp1);
        System.out.println(emp1.employeeTask());
    }
}
