class Shape {
    String color = "No color";

    void showColor() {
        System.out.println("Color: " + color);
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
        color = "Blue";
    }

    double calculateArea() {
        return 0.5 * base * height;
    }
}

public class ShapeTriangle {
    public static void main(String[] args) {
        Triangle t = new Triangle(10, 6);
        t.showColor();  // inherited from Shape
        System.out.println("Area of Triangle: " + t.calculateArea());
    }
}
