import java.util.Scanner;

class Alpha{
    public void calc(){
        System.out.println("Alpha Connection Established");
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Kindly Enter the Numerator for division : ");
            int numerator = sc.nextInt();
            System.out.println("Kindly Enter the Denominator for division : ");
            int denominator = sc.nextInt();

            int result = numerator / denominator;
            System.out.println("Result is : " + result);
        }
        catch(ArithmeticException e){
            System.out.println("Please Enter a positive number");
        }

        System.out.println("Alpha Connection Terminated");
    }
}
class Beta{

    public void display(){
        System.out.println("Beta Connection Established");
        Alpha a = new Alpha();
        a.calc();
        System.out.println("Beta Connection Terminated");
    }

}
public class LaunchExcept4 {
    public static void main(String[] args) {

        System.out.println("Main Connection Established");
        Beta b = new Beta();
        b.display();
        System.out.println("Main Connection Terminated");
    }
}
