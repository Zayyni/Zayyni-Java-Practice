interface Animal1 {
    void eat();
}


interface Animal2 {
    void getData();
}
public class LaunchLambda2 {
    public static void main(String[] args) {

        Animal animal = new Animal(){
            @Override
            void eat() {
                System.out.println("eat method in interface");
            }
        };
//        Animal1 a = () -> System.out.println("in side the animal interface");
        animal.eat();

        Animal2 animal2 = () ->{
                System.out.println("getData method in interface");
        };

        animal2.getData();

    }
}
