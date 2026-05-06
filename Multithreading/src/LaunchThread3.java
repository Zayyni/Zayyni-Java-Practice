import java.util.Scanner;

class Alpha1 extends Thread {

    @Override
    public void run() {
        banking();
    }
    public void banking(){
        System.out.println("Banking Activity Started..............");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your User Number: ");
        int user=sc.nextInt();
        System.out.println("Enter Your Password: ");
        String pass=sc.next();
        System.out.println("Collect your Cash");
        System.out.println("Banking Activity Terminated..............");
    }

}
class Beta1 extends Thread {
    @Override
    public void run(){
        try {
            printingStars();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void printingStars() throws InterruptedException{
        System.out.println("Printing Activity Started..............");
        for (int i=0; i<4; i++)
        {
            System.out.println("**");
            Thread.sleep(4000);
        }
        System.out.println("Printing Activity Terminated..............");
    }
}
class Gamma1 extends Thread {

    @Override
    public void run(){
        try {
            focus();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void focus() throws InterruptedException{
        System.out.println("Printing Important Message Started..............");
        for (int i=0; i<4; i++)
        {
            System.out.println("Focus is the key to master any skills");
            Thread.sleep(4000);
        }
        System.out.println("Printing Important Message Terminated..............");

    }
}

public class LaunchThread3
{
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Application Started................");

        Alpha1 a=new Alpha1();
        Beta1 b=new Beta1();
        Gamma1 g=new Gamma1();
        a.start();
        b.start();
        g.start();


        System.out.println("Application Terminated..............");
    }
}
