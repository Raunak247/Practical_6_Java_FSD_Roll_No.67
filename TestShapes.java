class Shape {
    void draw() {
        System.out.println("drawing...");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Triangle");
    }
}

public class TestShapes {
    public static void main(String[] args) {
        Shape s;

        s = new Rectangle();
        s.draw();

        s = new Circle();
        s.draw();

        s = new Triangle();
        s.draw();
    }
}