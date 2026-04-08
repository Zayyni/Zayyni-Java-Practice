class Demo2{
    static int a,b,c;

    int x, y, z;

    static {
        System.out.println("static block");
        a=10;
        b=20;
        c=30;
    }

    static void display(){
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);

    }
    //Java initialization block below if we do not define any name of method
    {
        x=44;
        y=45;
        z=46;
        System.out.println("Java Initialization block");
    }
    Demo2(){
        System.out.println("Demo2 constructor");
    }

    void display2(){
        System.out.println("non static method");
        System.out.println("a : "+ a);
        System.out.println("b : "+ b);
        System.out.println("c : "+ c);
        System.out.println("x : "+ x);
        System.out.println("y : "+ y);
        System.out.println("z : "+ z);
    }
}
public class LaunchStatic2 {
    public static void main(String[] args) {

        Demo2.display();

        Demo2 d = new Demo2();
        d.display2();

        Demo2 d2 = new Demo2();
        d2.display2();
    }
}
