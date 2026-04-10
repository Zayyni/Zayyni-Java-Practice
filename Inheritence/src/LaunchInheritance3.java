class Zayyni1{
     String name = "Zayyni";

    void display(){
        System.out.println("Name is " + name);
    }
}
class Alien1 extends Zayyni1{


    void display2() {
        name="Alien";
    }
}
public class LaunchInheritance3 {
    public static void main(String[] args) {
        Alien1 a=new Alien1();
        a.display();
    }
}
