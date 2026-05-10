package objectlevellocking;

public class MCBBank {

    static int accountBalance;

    public MCBBank(int accountBalance) {
        this.accountBalance = accountBalance;
    }
    static synchronized public void withdraw(int amount) {
        accountBalance -= amount;
    }

    static synchronized public void deposit(int amount) {
        accountBalance += amount;
    }

    static synchronized public void getAccountBalance() {
         System.out.println("Your account balance is " +accountBalance);
    }
}
