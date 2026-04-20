//class A{
//    public void show(){
//        System.out.println("in B Show method");
//    }
//}
//
//class B extends A{
//    public void show(){
//        System.out.println("in B Show method");
//    }
//}
/**
 * This is multiline comment for generating java doc
 *
 */
class Person{

//    int age;
//    String name;
    public void printName(){
        System.out.println("Zayyni");
    }

     class Phone{
//        int price;
//        String model;

        public void details()
        {
            System.out.println("SamSung");
        }
    }

}

public class DemoLambda {
    public static void main(String[] args) {

//        A a = new A();
//        A a = new B();
//        a.show();

        Person p = new Person();
        p.printName();
//        p.age = 18;
//        p.name = "John Smith";
        Person.Phone phone = p.new Phone();
        phone.details();

    }
}
