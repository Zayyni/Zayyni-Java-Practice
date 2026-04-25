import java.util.Arrays;

class Zayyni{
     String courseName;
     int courseCost;
     String city;
}
public class LaunchArray6
{
    public static void main(String[] args)
    {
        Zayyni obj = new Zayyni();
        System.out.println(obj.getClass().getName());

        System.out.println("**************************************");
//        TShaped t2 = new TShaped();

        int a[] = new int[3];
        System.out.println(a);
        System.out.println(a.getClass().getName());

        System.out.println("**************************************");

        int ar[][] = new int[3][5];
        System.out.println(ar);
        System.out.println(ar.getClass().getName());

        System.out.println("**************************************");

        int array[] = {3,5,3,7,8};
        for(int elem: array)
        {
            System.out.print(elem + " ");
        }
        System.out.println();
        System.out.println("***************************************");
        Arrays.sort(array);
        for(int elem: array)
        {
            System.out.print(elem + " ");
        }

//        System.out.println(Arrays.toString(array));


    }
}
