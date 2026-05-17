package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaunchApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Zayyni zayyni = context.getBean(Zayyni.class);
        Boolean status=zayyni.buyTheCourse(500.0);
        if (status) {
            System.out.println("Course purchased successfully");
        }
        else {
            System.out.println("Course purchase failed");
        }
    }
}
