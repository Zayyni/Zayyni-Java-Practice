import java.util.Scanner;

class Alpha1{
    public void calc() throws ArithmeticException
    {
        System.out.println("Alpha Connection Established");
            Scanner sc = new Scanner(System.in);
            System.out.println("Kindly Enter the Numerator for division : ");
            int numerator = sc.nextInt();
            System.out.println("Kindly Enter the Denominator for division : ");
            int denominator = sc.nextInt();

            int result = numerator / denominator;
            System.out.println("Result is : " + result);

        System.out.println("Alpha Connection Terminated");
    }
}
public class LaunchExcept5{
    public static void main(String[] args) {

        try {

            System.out.println("Main Connection Established");
            Alpha1 a = new Alpha1();
            a.calc();
        }
        catch(ArithmeticException e){
            System.out.println("Please Enter a positive number");
        }
        System.out.println("Main Connection Terminated");
    }
}
