package objectlevellocking;

public class ATM extends Thread
{

    @Override
    public void run()
    {
        System.out.println("ATM started for Withdraw");
        MCBBank.withdraw(3000);

    }
}
