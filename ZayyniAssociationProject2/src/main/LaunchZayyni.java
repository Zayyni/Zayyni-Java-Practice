package main;

import service.DevOps;
import service.Java;
import service.SpringBoot;

public class LaunchZayyni {
    public static void main(String[] args) {
        Zayyni z = new Zayyni(new Java());
        z.setCourse(new SpringBoot());
        Boolean status = z.buyCourse(666.0);
        if (status){
            System.out.println("Zayyni buyed course");
        }else {
            System.out.println("Zayyni not buyed course");
        }
    }
}
