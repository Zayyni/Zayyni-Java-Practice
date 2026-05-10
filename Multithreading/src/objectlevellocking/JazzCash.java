package objectlevellocking;

public class JazzCash extends Thread
{
    private MCBBank bank;
    public JazzCash(MCBBank bank)
    {
        this.bank = bank;
    }
    @Override
    public void run()
    {
        System.out.println("ATM started for JazzCash Deposit");
        bank.deposit(5000);
    }
}
