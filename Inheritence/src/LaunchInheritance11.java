class Demo4{

    static int a;

    public static void display(){
        a=10;
        System.out.println(a);
    }

}
class Demo5 extends Demo4{

    public static void display(){
        a=10;
        System.out.println(a + "child class display");
    }
}

public class LaunchInheritance11 {
    public static void main(String[] args) {
        Demo5 d = new Demo5();
        d.display();

        Demo5.display();
    }
}
