import java.util.ArrayList;

public class LaunchWrapper {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);

        Integer i = Integer.valueOf(110);
        System.out.println(" " + i);

        //Boxing Converting primitive data type into its corresponding wrapper class object
        //Auto Boxing : Automatically converting primitive data type into its corresponding wrapper class object
        int n1=18;
        Integer n2=n1;

        //UnBoxing : Converting wrapper class object into its corresponding primitive date type
        //Auto UnBoxing : Automatically Converting wrapper class object into its corresponding primitive date type

        Integer n3 = Integer.valueOf(11);
        int n4=n3;//auto unboxing

        int n5 = n3.intValue(); //unboxing


    }
}
