package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaunchMain {
    public static void main(String[] args) {

        //Two Types of bean IOC container
        //1. BeanFactory
        //2. ApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Zayyni z = context.getBean(Zayyni.class);
//        Boolean status= z.buyTheCourse(888.5);
//        if (status) {
//            System.out.println("The course has been purchased");
//        }else {
//            System.out.println("The course has not been purchased");
//        }
    }
}
