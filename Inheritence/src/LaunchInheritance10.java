class Animal{
   public void eat(){
       System.out.println("Animals are required to eat");
   }

   void sleep(){
       System.out.println("Animals are required to sleep");
   }
}
class Tiger extends Animal{

//    void eat(){ //cannot reduce the visibility while overriding inherited methods
//        System.out.println("Tigers are required to eat");
//    }

    public void eat(){
        System.out.println("Tigers are required to eat");
    }

    protected void sleep(){ //'we can increase the visibility while overriding the inherited method
        System.out.println("Tigers are required to sleep");
    }

}
public class LaunchInheritance10 {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.eat();
    }
}
