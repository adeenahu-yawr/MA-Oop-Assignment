abstract class Shape3 {
    abstract double calculateArea();

    void display() {
        System.out.println("This is a shape.");
    }
}

class Circle2 extends Shape3 {
    double radius;

    Circle2(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return 3.14 * radius * radius;
    }
}

public class ShapeCircle {
    public static void main(String[] args) {
        Shape3 s = new Circle2(7);
        s.display();
        System.out.println("Area of Circle: " + s.calculateArea());
    }
}
