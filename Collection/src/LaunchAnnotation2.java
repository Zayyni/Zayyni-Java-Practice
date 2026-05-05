import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface CricketPlayer
{
    String country() default "PAKISTAN";
    int age();
}//@ this specifies my compiler that annotation type is being created

//Babar Azam is cricket player who plays for Pakistan
@CricketPlayer(country = "Pakistan", age = 32)
class BabarAzam{
//    @CricketPlayer
    private int innings;
    public BabarAzam(){

    }

    public int getInnings() {
        return innings;
    }

    public void setInnings(int innings) {
        this.innings = innings;
    }

}

public class LaunchAnnotation2
{
    public static void main(String[] args) {
        BabarAzam babarAzam=new BabarAzam();
        babarAzam.setInnings(300);
        System.out.println(babarAzam.getInnings());
    }
}
