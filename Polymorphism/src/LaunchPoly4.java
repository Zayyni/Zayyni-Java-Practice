class Animal {
    public void eat(){
        System.out.println("Animal is Eating...");
    }

    public void run(){
        System.out.println("Animal is Running...");
    }
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
public class LaunchPoly4 {
    public static void main(String[] args) {
        Tiger t = new Tiger();

        Monkey m = new Monkey();

        Forest f = new Forest();
        f.permit(t);
        f.permit(m);

    }
}
