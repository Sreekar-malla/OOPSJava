package OOPSRev;

class Plane{
    public void takeoff(){
        System.out.println("Plane tookOff...");
    }
    public void fly(){
        System.out.println("Plane is flying...");
    }
    public void land(){
        System.out.println("Plane is landing...");
    }
}

class PassengerPlane extends Plane{
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

class CargoPlane extends Plane{
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

class FighterPlane extends Plane{
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

class Airport{
    void allowPermit(Plane p){
        p.takeoff();
        p.fly();
        p.land();
        System.out.println();
    }
}

public class Test {
    public static void main(String[] args) {
        PassengerPlane p = new PassengerPlane();
        CargoPlane c = new CargoPlane();
        FighterPlane f = new FighterPlane();

        Airport a = new Airport();
        a.allowPermit(p);
        a.allowPermit(c);
        a.allowPermit(f);
    }
}
