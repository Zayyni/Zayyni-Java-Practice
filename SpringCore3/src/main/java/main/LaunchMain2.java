package main;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class LaunchMain2 {
    public static void main(String[] args) {

        //Two Types of bean IOC container
        //1. BeanFactory
        //2. ApplicationContext
        DefaultListableBeanFactory beanFactory=new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions(new ClassPathResource("applicationContext.xml"));
        Zayyni z = beanFactory.getBean(Zayyni.class);
        Boolean status= z.buyTheCourse(888.5);
        if (status) {
            System.out.println("The course has been purchased");
        }else {
            System.out.println("The course has not been purchased");
        }

    }
}
