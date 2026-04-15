class AeroPlane{

    public void takeoff(){
        System.out.println("AeroPlane takeoff");
    }
    public void landing(){
        System.out.println("AeroPlane is Landing");
    }

}
class CargoPlane extends AeroPlane{

    public void takeoff(){
        System.out.println("CargoPlane takes longer runway to takeoff");
    }
    public void fly(){
        System.out.println("CargoPlane flies");
    }
}
class FighterPlane extends AeroPlane{

    public void takeoff(){
        System.out.println("FighterPlane takes shorter runway to takeoff");
    }
    public void fly(){
        System.out.println("FighterPlane flies");
    }
}

public class LaunchPoly1 {
    public static void main(String[] args) {

        AeroPlane cp= new CargoPlane(); // upcasting
        cp.takeoff();
        cp.landing();
        ((CargoPlane) cp).fly(); // downcasting

        AeroPlane fp = new FighterPlane();
        fp.takeoff();
        fp.landing();
        ((FighterPlane) fp).fly();
    }
}
