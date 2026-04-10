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

}
public class LaunchInheritance2 {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        cp.fly();
        cp.landing();
        cp.getClass();
        PassengerPlane pp = new PassengerPlane();
        pp.fly();
        pp.landing();
//        CommercialPlane cp2 = new CommercialPlane();
//        cp2.fly();
//        cp2.landing();
    }
}
