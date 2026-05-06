import java.util.Scanner;

class Alpha{

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
class Beta{
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
class Gamma{
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

public class LaunchThread2
{
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Application Started................");

        Alpha a=new Alpha();
        Beta b=new Beta();
        Gamma g=new Gamma();
        a.banking();
        b.printingStars();
        g.focus();


        System.out.println("Application Terminated..............");
    }
}
