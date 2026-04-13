class Animal{
   public void eat(){
       System.out.println("Animals are required to eat");
   }

   void sleep(){
       System.out.println("Animals are required to sleep");
   }

   public void walk(){
       System.out.println("Animals are required to walk");
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

    public int walk(){// the primivte return types cannot be changed
        System.out.println("Tigers are required to walk");
        return 10;
    }

}
public class LaunchInheritance10 {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.eat();
    }
}
