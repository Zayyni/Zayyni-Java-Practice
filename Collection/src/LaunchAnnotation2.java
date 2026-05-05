import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.CONSTRUCTOR,ElementType.METHOD})
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

        System.out.println("****************************");
         Class<? extends BabarAzam> c=babarAzam.getClass();
         Annotation an=c.getAnnotation(CricketPlayer.class);
         CricketPlayer cp = (CricketPlayer)an;
         int age = cp.age();
         String country = cp.country();

         System.out.println("Information of attributes of annotations are "+age +" and "+country);
    }
}
