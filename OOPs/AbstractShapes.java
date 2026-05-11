abstract class Shape {

    abstract void area();
}

class Circle extends Shape {
    int radius = 5;

    @Override
    void area() {
        double a = 3.14 * radius * radius;
        System.out.println("Circle Area: " + a);
    }
}

class Rectangle extends Shape {
    int length = 4;
    int width = 6;

    @Override
    void area() {
        int a = length * width;
        System.out.println("Rectangle Area: " + a);
    }
}

public class Main {
    public static void main(String[] args) {

        Shape s1 = new Circle();
        s1.area();

        Shape s2 = new Rectangle();
        s2.area();
    }
}