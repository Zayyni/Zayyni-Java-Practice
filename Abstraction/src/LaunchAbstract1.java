abstract class Animal {
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

    }
}
