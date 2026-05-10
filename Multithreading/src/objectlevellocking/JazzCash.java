package objectlevellocking;

public class JazzCash extends Thread
{

    @Override
    public void run()
    {
        System.out.println("ATM started for JazzCash Deposit");
        MCBBank.deposit(5000);
    }
}
