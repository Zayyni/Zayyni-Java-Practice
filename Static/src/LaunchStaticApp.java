import java.util.Scanner;

class Farmer{
    float pa;
    float td;
    float si;
    static float roi;
    static {
        roi = 2.5f;
    }

    void acceptInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the loan amount in PKR: ");
        pa=sc.nextFloat();
        System.out.print("Enter the loan time duration in months: ");
        td=sc.nextFloat();
//        System.out.print("Enter the loan rate of interest: ");
//        roi=sc.nextFloat();

    }
    void compute(){
        si = (pa*td*roi)/100.0f;
    }
    void display(){
        System.out.println("Your simple interest is : "+si);
    }
}
public class LaunchStaticApp {
    public static void main(String[] args) {
        Farmer f = new Farmer();
        System.out.println("Farmer 1");
        f.acceptInput();
        f.compute();
        f.display();
        Farmer f2 = new Farmer();
        System.out.println("Farmer 2");
        f2.acceptInput();
        f2.compute();
        f2.display();
        Farmer f3 = new Farmer();
        System.out.println("Farmer 3");
        f3.acceptInput();
        f3.compute();
        f3.display();

    }
}
