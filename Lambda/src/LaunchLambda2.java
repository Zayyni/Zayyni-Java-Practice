interface Animal1 {
    void eat();
}

public class LaunchLambda2 {
    public static void main(String[] args) {

        Animal animal = new Animal(){
            @Override
            void eat() {
                System.out.println("eat method in interface");
            }
        };
        animal.eat();

    }
}
