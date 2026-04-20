abstract class Animal {

    abstract void eat();

}
class Cat extends Animal {
    void eat() {
        System.out.println("cat eat");
    }
}

public class LaunchLambda {
    public static void main(String[] args) {
//       Animal a = new Cat();
        Animal a = new Animal() {
            @Override
            void eat() {
                System.out.println("cat eat in anonymous class");
            }
        };
       a.eat();
    }
}
