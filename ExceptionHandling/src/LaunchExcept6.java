import java.util.Scanner;

class Alpha2{
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
            throw e;
        }

        System.out.println("Alpha Connection Terminated");
    }
}
public class LaunchExcept6 {
    public static void main(String[] args) {

        try {
            System.out.println("Main Connection Established");
            Alpha2 a = new Alpha2();
            a.calc();
        }
        catch(ArithmeticException e){
            System.out.println("Please Enter a positive number from main method");
        }
        System.out.println("Main Connection Terminated");
    }
}
