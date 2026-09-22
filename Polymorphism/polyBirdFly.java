class Bird {
    void fly() {
        System.out.println("Bird can fly.");
    }
}

class Sparrow extends Bird {
    @Override
    void fly() {
        System.out.println("Sparrow flies high in the sky.");
    }
}

class Ostrich extends Bird {
    @Override
    void fly() {
        System.out.println("Ostrich cannot fly, it runs instead.");
    }
}

public class BirdFly {
    public static void main(String[] args) {
        Bird b1 = new Sparrow();
        Bird b2 = new Ostrich();

        b1.fly();
        b2.fly();
    }
}
