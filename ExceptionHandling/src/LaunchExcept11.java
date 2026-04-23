import java.util.Scanner;


class InvalidCustomerException extends RuntimeException {
    public InvalidCustomerException(String message) {
        super(message);
    }

}
class Atm{
    private int acc =4545;
    private int pin = 1234;

    int accountNo;
    int pinNo;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account no");
        accountNo = sc.nextInt();
        System.out.println("Enter pin");
        pinNo = sc.nextInt();
    }

    public void verify() throws InvalidCustomerException {
        if(acc==accountNo && pin==pinNo){
            System.out.println("Proceed to collect cash");
        }else{
//            System.out.println("Invalid account");
//            input();
//            verify();
            InvalidCustomerException e = new InvalidCustomerException("INVALID CREDENTIALS");
            System.out.println(e.getMessage());
            throw e;

//            throw new InvalidCustomerException("Invalid Credentials !");//another way to define the exception
        }
    }


}

class Bank{
    public void initiate(){
        Atm atm1 = new Atm();
        try {
            atm1.input();
            atm1.verify();
        }
        catch(InvalidCustomerException e){
            //System.out.println(e);
            System.out.println("Try again!");
            try {
                atm1.input();
                atm1.verify();
            }
            catch(InvalidCustomerException e1){
                //System.out.println(e);
                System.out.println("Try again!");
                try {
                    atm1.input();
                    atm1.verify();
                }
                catch(InvalidCustomerException e2){
                    System.out.println("Your account number is now terminated so try again after sometime");
                }
            }
        }
    }
}

public class LaunchExcept11 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.initiate();
    }
}
