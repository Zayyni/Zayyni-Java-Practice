import java.util.Scanner;

public class LaunchExcept1 {
    public static void main(String[] args) {
        // int void = 20; Complile Time Error
        System.out.println("Connection Established");
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Kindly Enter the Numerator for division : ");
            int numerator = sc.nextInt();
            System.out.println("Kindly Enter the Denominator for division : ");
            int denominator = sc.nextInt();

            int result = numerator / denominator;
            System.out.println("Result is : " + result);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Connection Terminated");
    }
}
