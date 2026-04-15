class AeroPlane2{

    public void takeoff(){
        System.out.println("AeroPlane takeoff");
    }
    public void landing(){
        System.out.println("AeroPlane is Landing");
    }

    public void fly(){
        System.out.println("AeroPlane flies");
    }

}
class CargoPlane2 extends AeroPlane2{

    public void takeoff(){
        System.out.println("CargoPlane takes longer runway to takeoff");
    }
    public void fly(){
        System.out.println("CargoPlane flies");
    }

    public void landing(){
        System.out.println("CargoPlane is Landing");
    }
}
class FighterPlane2 extends AeroPlane2{

    public void takeoff(){
        System.out.println("FighterPlane takes shorter runway to takeoff");
    }
    public void fly(){
        System.out.println("FighterPlane flies");
    }

    public void landing(){
        System.out.println("FighterPlane is Landing");
    }
}

class PassengerPlane2 extends AeroPlane2{

    public void takeoff(){
        System.out.println("PassengerPlane takes longer runway to takeoff");
    }
    public void fly(){
        System.out.println("PassengerPlane flies");
    }

    public void landing(){
        System.out.println("PassengerPlane is Landing");
    }
}

class Airport{
    public void Permit(AeroPlane2 plane){
        plane.takeoff();
        plane.landing();
        plane.fly();
    }
}


public class LaunchPoly3 {
    public static void main(String[] args) {

        CargoPlane2 c = new CargoPlane2();

        FighterPlane2 f = new FighterPlane2();

        PassengerPlane2 p = new PassengerPlane2();

        Airport a = new Airport();

        a.Permit(c);
        a.Permit(f);
        a.Permit(p);

    }
}
