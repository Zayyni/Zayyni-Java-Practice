import java.util.Scanner;


class InvalidCustomerException extends RuntimeException {

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

    public void verify(){
        if(acc==accountNo && pin==pinNo){
            System.out.println("Proceed to collect cash");
        }else{
//            System.out.println("Invalid account");
//            input();
//            verify();
//            InvalidCustomerException e = new InvalidCustomerException();
//            throw e;

            throw new InvalidCustomerException();//another way to define the exception
        }
    }


}

class Bank{
    public void initiate(){
        Atm atm1 = new Atm();
        atm1.input();
        atm1.verify();
    }
}

public class LaunchExcept11 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.initiate();
    }
}
