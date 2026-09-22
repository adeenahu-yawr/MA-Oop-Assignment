class Shape2 {
    void draw() {
        System.out.println("Drawing a generic shape.");
    }
}

class Circle extends Shape2 {
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Square extends Shape2 {
    @Override
    void draw() {
        System.out.println("Drawing a square.");
    }
}

public class ShapeDraw {
    public static void main(String[] args) {
        // runtime polymorphism - same reference type, different objects
        Shape2 s1 = new Circle();
        Shape2 s2 = new Square();

        s1.draw();
        s2.draw();
    }
}
