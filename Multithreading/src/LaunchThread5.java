import java.util.Scanner;

class Alpha3 implements Runnable {

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        if (threadName.equals("BANK")) {
            banking();
        }
        else if (threadName.equals("STAR")) {
            printingStars();
        }
        else {
            focus();
        }
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
    public void printingStars(){
        System.out.println("Printing Activity Started..............");
        for (int i=0; i<4; i++)
        {
            System.out.println("**");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Printing Activity Terminated..............");
    }

    public void focus(){
        System.out.println("Printing Important Message Started..............");
        for (int i=0; i<4; i++)
        {
            System.out.println("Focus is the key to master any skills");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Printing Important Message Terminated..............");

    }

}

public class LaunchThread5
{
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Application Started................");

        Alpha3 a=new Alpha3();

        Thread t1=new Thread(a);
        Thread t2=new Thread(a);
        Thread t3=new Thread(a);
        t1.setName("BANK");
        t2.setName("STAR");
        t3.setName("FOCUS");

        t1.start();
        t2.start();
        t3.start();




        System.out.println("Application Terminated..............");
    }
}
