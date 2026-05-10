package objectlevellocking;

public class EasyPaisa extends Thread
{

    @Override
    public void run()
    {
        System.out.println("ATM started for EasyPaisa Balance Check");
        MCBBank.getAccountBalance();
    }
}
