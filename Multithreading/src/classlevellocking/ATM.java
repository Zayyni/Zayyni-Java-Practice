package classlevellocking;

public class ATM extends Thread
{
    private MCBBank bank;

    public ATM(MCBBank bank){
        this.bank = bank;
    }

    @Override
    public void run()
    {
        System.out.println("ATM started for Withdraw");
        bank.withdraw(3000);

    }
}
