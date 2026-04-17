abstract class Animal {

    public Animal(){
        System.out.println("Animal Class Constructor");
    }
    public abstract void eat();

    public abstract void run();
}
class Tiger extends Animal {
    public void eat(){
        System.out.println("Tiger hunts and eats");
    }

    public void run(){
        System.out.println("Tiger is Running to hunt");
    }
}
class Monkey extends Animal {
    public void eat(){
        System.out.println("Monkey steals and eats...");
    }

    public void run(){
        System.out.println("Monkey is Running to steal");
    }
}
class Forest{

    public void permit(Animal animal){
        animal.eat();
        animal.run();
    }
}

public class LaunchAbstract1 {
    public static void main(String[] args) {
//        Animal a = new Animal();//we cannot create instance/object of an abstract class

        Tiger t = new Tiger();

        Monkey m = new Monkey();

        Forest f = new Forest();
        f.permit(t);
        f.permit(m);

    }
}
