class Vehicle {
    int wheels;

    void showWheels() {
        System.out.println("This vehicle has " + wheels + " wheels.");
    }
}

class Bike extends Vehicle {
    Bike() {
        wheels = 2;
    }

    void ringBell() {
        System.out.println("Bike bell: Ting Ting!");
    }
}

public class VehicleBike {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.showWheels();  // inherited from Vehicle
        b.ringBell();    // own method
        System.out.println("Bike object created successfully.");
    }
}
