class Zayyni2{

    //Constructor new gets inherited (it does not participate in inheritance)
    Zayyni2(){
        System.out.println("Zayyni2 zero param constructor");
    }
}
class Alien2 extends Zayyni2{

    //Super
}
public class LaunchInheritance5 {
    public static void main(String[] args) {
        Alien2 al = new Alien2();

    }
}
