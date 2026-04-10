class Zayyni{
    int age;
    void display(){
        age=25;
        System.out.println("Zayyni is of age : " + age);
    }
}

class Alien extends Zayyni{

}
public class LaunchInheritance1 {
    public static void main(String[] args) {
//        Zayyni z=new Zayyni();
//        z.display();
        Alien a=new Alien();
        a.display();
    }
}
