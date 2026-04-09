class Demo3{
//    static int a;
//    static {
//        a=10;
//    }

//    static {
//        System.out.println(a);//cannot read the value of a before its field defined
//    }
//    static int a;

    static {
        display();
    }
    static int a=20;
    public static void display(){
        System.out.println(a);
    }

}
public class LaunchStatic5 {
    public static void main(String[] args) {
        Demo3.display();
        Demo3 obj = new Demo3();
        obj.display();

    }
}
