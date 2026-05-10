package classlevellocking;

public class MCBBank {

    static int accountBalance = 4000;

//    public MCBBank(int accountBalance) {
//        this.accountBalance = accountBalance;
//    }
    synchronized static public void withdraw(int amount) {
        accountBalance -= amount;
    }

    synchronized static public void deposit(int amount) {
        accountBalance += amount;
    }

    synchronized static public void getAccountBalance() {
         System.out.println("Your account balance is " +accountBalance);
    }
}
