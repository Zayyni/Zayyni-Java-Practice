import java.util.Scanner;
class UnderAgeException extends Exception {
    public UnderAgeException(String message) {
         super(message);
    }

}
class OverAgeException extends Exception {
    public OverAgeException(String message) {
        super(message);
    }

}

class Applicant{
    int age;
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        age = sc.nextInt();
    }

    public void verify() throws UnderAgeException, OverAgeException{
        if(age >= 18 && age <= 60){
            System.out.println("You can proceed with Licence Application");
        }
        else if(age < 18){
           UnderAgeException underAgeException = new UnderAgeException("Under age");
           System.out.println(underAgeException.getMessage());
           throw underAgeException;
        }
        else{
            OverAgeException overAgeException = new OverAgeException("Over age");
            System.out.println(overAgeException.getMessage());
            throw overAgeException;
        }
    }
}
class Licence{
    public void application(){
        Applicant applicant = new Applicant();
        try {
            applicant.input();
            applicant.verify();
        }
        catch (UnderAgeException | OverAgeException e){
            System.out.println("Try again!");
            try {
                applicant.input();
                applicant.verify();
            }
            catch (UnderAgeException | OverAgeException e1){
                System.out.println("You are blocked to proceed with Licence Application");
            }
        }
    }
}
public class LaunchExcept12 {
    public static void main(String[] args) {

        Licence licence = new Licence();
        licence.application();
    }
}
