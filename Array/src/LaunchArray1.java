import java.util.Scanner;

public class LaunchArray1 {
    public static void main(String[] args) {

        int []marks = new int[5];
//        marks[0] = 10;
//        marks[1] = 20;
//        marks[2] = 30;
//        marks[3] = 40;
//        marks[4] = 50;
//
//        System.out.println(marks[0]);
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Kindly enter the marks of the student " + i);
            marks[i] = sc.nextInt();
        }
        System.out.println("The marks of the students are: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();


    }
}
