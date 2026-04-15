class AeroPlane1{

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
class CargoPlane1 extends AeroPlane1{

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
class FighterPlane1 extends AeroPlane1{

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
public class LaunchPoly2 {
    public static void main(String[] args) {
       CargoPlane1 cp = new CargoPlane1();

       FighterPlane1 fp = new FighterPlane1();

       AeroPlane1 aeroplane;
        aeroplane=cp;

        aeroplane.takeoff();
        aeroplane.fly();
        aeroplane.landing();

        System.out.println("**************************************");

        aeroplane = fp;
        aeroplane.takeoff();
        aeroplane.landing();
        aeroplane.fly();


    }
}
