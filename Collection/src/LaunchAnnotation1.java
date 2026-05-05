class Animal{
    public void animalUsuallyHuntsAndEats()
    {
        System.out.println("Animal usually Hunts and Eats");
    }
}
//override --> annotation to tell the compiler what is happening here.
class Tiger extends Animal{

    //overriding parent class method to suit child requirement
    @Override
    public void animalUsuallyHuntsAndEats() {
        System.out.println("Tiger usually Hunts and Eats");
    }
}

public class LaunchAnnotation1
{
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.animalUsuallyHuntsAndEats();
    }
}
