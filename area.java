class AreaCalculator {

    // Area of Square
    void area(int side) {
        int result = side * side;
        System.out.println("Area of Square: " + result);
    }

    // Area of Triangle
    void area(double base, double height) {
        double result = 0.5 * base * height;
        System.out.println("Area of Triangle: " + result);
    }

    // Area of Circle
    void area(double radius) {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + result);
    }

    public static void main(String[] args) {
        AreaCalculator obj = new AreaCalculator();

        obj.area(5);
        obj.area(10.0, 6.0);
        obj.area(7.0);
    }
}