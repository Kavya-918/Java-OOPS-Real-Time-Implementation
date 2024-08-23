//Implementation of polymorphism
class Plane{
    void fly(){
        System.out.println("Plane is flying");
    }
}
class cargoPlane extends Plane{
    void fly(){
        System.out.println("CargoPlane is flying at low height");
    }
    void carryCargo(){
        System.out.println("CargoPlane is carrying cargo");
    }
}
class PassengerPlane extends Plane{
    void fly(){
        System.out.println("PassengerPlane is flying at medium height");
    }
    void carryPassenger(){
        System.out.println("PassengerPlane is carrying passengers");
    }
}
class FighterPlane extends Plane{
    void fly(){
        System.out.println("FighterPlane is flying at great height");
    }
    void carryWeaapons(){
        System.out.println("FighterPlane is carrying weapons");
    }
}
public class Polymorphismimplementation {
    public static void main(String[] args) {
        cargoPlane cp = new cargoPlane();
        PassengerPlane pp = new PassengerPlane();
        FighterPlane fp = new FighterPlane();
        Plane ref;
        // Demonstrating polymorphism with CargoPlane
        ref=cp;// Parent reference to child object
        ref.fly();// Executes CargoPlane's fly method
        ((cargoPlane)ref).carryCargo(); // Downcasting to access CargoPlane's specific method

        // Demonstrating polymorphism with PassengerPlane
        ref=pp;
        ref.fly();// Executes PassengerPlane's fly method
        ((PassengerPlane)ref).carryPassenger();// Downcasting to access PassengerPlane's specific method

       // Demonstrating polymorphism with FighterPlane
        ref=fp;
        ref.fly();// Executes FighterPlane's fly method
        ((FighterPlane)ref).carryWeaapons();// Downcasting to access FighterPlane's specific method
    }
    }

