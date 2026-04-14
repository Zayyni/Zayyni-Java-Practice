//final class Plane1{ //final class cannot be inherited or cannot be Parent of any child class
//
//    public void fly(){
//        System.out.println("Planes are required to fly");
//    }
//}

class Plane1{ //final class cannot be inherited or cannot be Parent of any child class

    final void fly(){
        System.out.println("Planes are required to fly");
    }
}
class FighterPlane1 extends Plane1{

//    public void fly(){
//        System.out.println("FighterPlane 1 is flying");
//    }

}
public class LaunchInheritanceFinal {
    public static void main(String[] args) {
        FighterPlane1 plane1 = new FighterPlane1();
        plane1.fly();
    }
}
