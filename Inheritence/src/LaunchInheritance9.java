class Parent{
    int i = 10;

    void display(){
        System.out.println("Display of Parent");
    }
}
class Child extends Parent{
    int i=100;

    void alpha(){
        System.out.println("Alpha of Child");
        System.out.println(i);
        System.out.println(super.i);
//        display();
        super.display();
    }

    void display(){
        System.out.println("Display of Child");
    }
}
public class LaunchInheritance9
{
    public static void main(String[] args) {
//        Child c = new Child();
//        c.alpha();
        new Child().display();
        new Child().alpha();
    }
}
