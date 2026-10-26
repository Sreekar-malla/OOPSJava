package OOPSRev;
abstract class AeroPlane{
    public abstract void takeoff();
    public abstract void fly();
    public abstract void land();
}
class PassengerAeroPlane extends AeroPlane{
    public void takeoff(){
        System.out.println("PassengerPlane tookOff...");
    }
    public void fly(){
        System.out.println("PassengerPlane is flying...");
    }
    public void land(){
        System.out.println("PassengerPlane is landing...");
    }
}
class CargoAeroPlane extends AeroPlane{
    public void takeoff(){
        System.out.println("CargoPlane tookOff...");
    }
    public void fly(){
        System.out.println("CargoPlane is flying...");
    }
    public void land() {
        System.out.println("CargoPlane is landing...");
    }
}

class FighterAeroPlane extends AeroPlane{
    public void takeoff(){
        System.out.println("FighterPlane tookOff...");
    }
    public void fly(){
        System.out.println("FighterPlane is flying...");
    }
    public void land() {
        System.out.println("FighterPlane is landing...");
    }
}

class Airports{
    void allowPermit(AeroPlane p){
        p.takeoff();
        p.fly();
        p.land();
        System.out.println();
    }
}

public class absctImple {
    public static void main(String[] args) {
        PassengerAeroPlane p = new PassengerAeroPlane();
        CargoAeroPlane c = new CargoAeroPlane();
        FighterAeroPlane f = new FighterAeroPlane();

        Airports a = new Airports();
        a.allowPermit(p);
        a.allowPermit(c);
        a.allowPermit(f);
    }
}

