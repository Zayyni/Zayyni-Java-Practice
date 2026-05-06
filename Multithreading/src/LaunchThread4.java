import java.util.Scanner;

class Alpha2 implements Runnable {

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
class Beta2 implements Runnable {
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
class Gamma2 implements Runnable {

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

public class LaunchThread4
{
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Application Started................");

        Alpha2 a=new Alpha2();
        Beta2 b=new Beta2();
        Gamma2 g=new Gamma2();

        Thread t1=new Thread(a);
        Thread t2=new Thread(b);
        Thread t3=new Thread(g);
        System.out.println(t1.isAlive());//false
        System.out.println(t2.isAlive());//false
        System.out.println(t3.isAlive());//false

        t1.start();
        t2.start();
        t3.start();
        System.out.println(t1.isAlive());//true
        System.out.println(t2.isAlive());//true
        System.out.println(t3.isAlive());//true


        System.out.println("Application Terminated..............");
    }
}
