package objectlevellocking;

public class MCBBank {

    int accountBalance;

    public MCBBank(int accountBalance) {
        this.accountBalance = accountBalance;
    }
    public void withdraw(int amount) {
        accountBalance -= amount;
    }

    public void deposit(int amount) {
        accountBalance += amount;
    }

    public void getAccountBalance() {
         System.out.println("Your account balance is" +accountBalance);
    }
}
