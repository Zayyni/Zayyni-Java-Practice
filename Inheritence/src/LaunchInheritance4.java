class Parent
{
    void display(){
        System.out.println("Parent Class");
    }

}
class Child extends Parent{

}
public class LaunchInheritance4 {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
