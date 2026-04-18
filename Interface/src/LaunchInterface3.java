interface Zayyni{
    void show();
    default void display(){
        System.out.println("Zayyni working on method body in the interface class");
    }
}
class Alien implements Zayyni{
    public void show(){
        System.out.println("Alien is showing");
    }
}
public class LaunchInterface3 {
    public static void main(String[] args) {
        Alien obj = new Alien();
        obj.show();
        obj.display();
    }
}
