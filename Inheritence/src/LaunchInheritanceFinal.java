//final class Plane1{ //final class cannot be inherited or cannot be Parent of any child class
//
//    public void fly(){
//        System.out.println("Planes are required to fly");
//    }
//}

class Plane1{ //final class cannot be inherited or cannot be Parent of any child class

    final int age =10;

    final void fly(){ // final methods do participate in inheritance
//        age=20;
        System.out.println("Planes are required to fly");
    }
}
class FighterPlane1 extends Plane1{


//    public void fly(){ //cannot override the final method in child class
//        System.out.println("FighterPlane 1 is flying");
//    }

}
public class LaunchInheritanceFinal {
    public static void main(String[] args) {
        FighterPlane1 plane1 = new FighterPlane1();
        plane1.fly();
    }
}
