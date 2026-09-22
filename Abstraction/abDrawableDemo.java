// Interface - 100% abstraction
interface Drawable {
    void draw();  // implicitly abstract
}

class SquareShape implements Drawable {
    int side;

    SquareShape(int side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a square with side: " + side);
    }

    int calculateArea() {
        return side * side;
    }
}

public class DrawableDemo {
    public static void main(String[] args) {
        Drawable d = new SquareShape(5);
        d.draw();

        SquareShape sq = new SquareShape(5);
        System.out.println("Area: " + sq.calculateArea());
    }
}
