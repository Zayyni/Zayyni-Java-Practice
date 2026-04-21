import java.util.Scanner;

public class LaunchExcept3 {
    public static void main(String[] args) {

        System.out.println("Connection Established");
        Scanner scan = new Scanner(System.in);
        try {

            System.out.println("Kindly Enter the Numerator for division : ");
            int numerator = scan.nextInt();
            System.out.println("Kindly Enter the Denominator for division : ");
            int denominator = scan.nextInt();

            int result = numerator / denominator;
            System.out.println("Result is : " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Please enter a positive integer");
        }
        try {

            System.out.println("Kindly Enter the size of array : ");
            int size = scan.nextInt();

            int[] array = new int[size];

            System.out.println("Kindly Enter the elements to be inserted into array : ");
            int elements = scan.nextInt();

            System.out.println("Kindly Enter the position at which element to be inserted into array : ");
            int position = scan.nextInt();
            array[position] = elements;

            System.out.println("Data inserted into array : " + array[position]);
        }

        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index out of bounds");
        }
        catch (NegativeArraySizeException e)
        {
            System.out.println("Negative array size");
        }
        catch (Exception e) {
            System.out.println("Something went wrong");
        }

        System.out.println("Connection Terminated");

    }
}
