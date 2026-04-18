//interface Demo1{
//    void display();
//}
//interface Demo2 implements Demo1{ //it is illegal for an interface to implement another interface
//
//}

interface Demo1{
    void display();
    float pi = 3.14f; // public static final
}
interface Demo2 extends Demo1{
    void show();
}
class Alpha implements Demo2{
    public void display(){
        System.out.println("Display of Alpha");
    }
    public void show(){
        System.out.println("Show of Alpha");
    }
}
public class LaunchInterface2 {
    public static void main(String[] args) {
       Demo1 demo1= new Alpha();
       demo1.display();
//       Demo1.pi=3.4f; // by default all the variables are final and static in interface

        Demo2 demo2= new Alpha();
        demo2.display();
        demo2.show();
    }
}
