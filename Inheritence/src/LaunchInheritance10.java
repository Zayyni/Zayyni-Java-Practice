class Plane{

}
class FigherPlane extends Plane{

}
class Animal{
   public void eat(String foodType){
       System.out.println("Animals are required to eat");
   }

   void sleep(){
       System.out.println("Animals are required to sleep");
   }

   public Plane walk(){
       System.out.println("Animals are required to walk");
       Plane p = new Plane();
       return p;
   }
}
class Tiger extends Animal{

//    void eat(){ //cannot reduce the visibility while overriding inherited methods
//        System.out.println("Tigers are required to eat");
//    }

    public void eat(String foodType){ // this is acting as method overriding
        System.out.println("Tigers are required to eat");
    }

    public void eat(){  //this is acting like speacilized method
        System.out.println("Tigers are required to eat");
    }//Such methods which are only in the child class and not in the parent class


    protected void sleep(){ //'we can increase the visibility while overriding the inherited method
        System.out.println("Tigers are required to sleep");
    }

//    public int walk(){// the primivte return types cannot be changed
//        System.out.println("Tigers are required to walk");
//        return 10;
//    }

    public FigherPlane walk(){ // co-varient return type (ON return type only parent child relationship is allowed
       System.out.println("Tigers are required to walk");
       FigherPlane fp = new FigherPlane();
       return fp;
    }

}
public class LaunchInheritance10 {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.eat();
    }
}
