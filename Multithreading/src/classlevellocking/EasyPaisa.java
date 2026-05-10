package classlevellocking;

public class EasyPaisa extends Thread
{
    private MCBBank bank;
    public EasyPaisa(MCBBank bank)
    {
        this.bank = bank;
    }

    @Override
    public void run()
    {
        System.out.println("ATM started for EasyPaisa Balance Check");
        bank.getAccountBalance();
    }
}
