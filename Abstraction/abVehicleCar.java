abstract class Vehicle2 {
    abstract void start();  // abstract method - no body

    void fuel() {
        System.out.println("Vehicle needs fuel.");
    }
}

class Car extends Vehicle2 {
    @Override
    void start() {
        System.out.println("Car starts with a key.");
    }
}

public class VehicleCar {
    public static void main(String[] args) {
        Vehicle2 v = new Car();
        v.start();
        v.fuel();
    }
}
