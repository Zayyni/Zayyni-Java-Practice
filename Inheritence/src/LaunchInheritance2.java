class AeroPlane //extend Object class (default nature of java)
{

    void fly(){
        System.out.println("AeroPlane flies");
    }
    void landing(){
        System.out.println("AeroPlane lands");
    }
}
class CargoPlane extends AeroPlane{


}

//class CommercialPlane extends CargoPlane , AeroPlane{ A class can not extend multiple classes
//}
//Mutiplelevel inheritance is not allowed in java
class PassengerPlane extends AeroPlane{

    void fly(){
        System.out.println("Passenger Plane files at medium height  ");
    }

    void takeOff(){
        System.out.println("Passenger Plane is taking off ");
    }
}
public class LaunchInheritance2 {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        cp.fly();
        cp.landing();
        cp.getClass();
        AeroPlane pp = new PassengerPlane();//Upcasting (creating parent type reference for child type object)
        pp.fly();
        pp.landing();
        ((PassengerPlane)pp).takeOff();//DownCasting(temporarily changing parent type reference to child type to access specialized behavior present in the child class)
//        CommercialPlane cp2 = new CommercialPlane();
//        cp2.fly();
//        cp2.landing();
    }
}
