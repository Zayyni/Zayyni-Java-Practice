package main;
//
//class Alpha{
//
//    public void alpha(){
//        //statements
//        //logic
//
//    }
//
//}
//class Beta{
//
//    public void beta(){
//        Alpha beta = new Alpha();
//        beta.alpha();
//    }
//}

import service.Java;
import service.SpringBoot;
import service.Zayyni;

public class LaunchApp {
    public static void main(String[] args) {
        Zayyni zayyni = new Zayyni();
        zayyni.setCourse(new Java());
//        zayyni.setCourse(new SpringBoot());
        Boolean status = zayyni.buyJavaCourse(44405.5);
        if (status) {
            System.out.println("Course Enrolled successfully");
        }else {
            System.out.println("Course Not Enrolled");
        }
    }
}
