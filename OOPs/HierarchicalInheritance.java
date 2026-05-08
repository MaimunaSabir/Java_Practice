class Shape {
    String color;

    Shape(String c) {
        color = c;
    }

    void displayShape() {
        System.out.println("Color: " + color);
    }
}

// Circle class
class Circle extends Shape {
    int radius;

    Circle(String c, int r) {
        super(c);
        radius = r;
    }

    void area() {
        double a = 3.14 * radius * radius;
        displayShape();
        System.out.println("Circle Area: " + a);
    }
}

// Rectangle class
class Rectangle extends Shape {
    int length;
    int width;

    Rectangle(String c, int l, int w) {
        super(c);
        length = l;
        width = w;
    }

    void area() {
        int a = length * width;
        displayShape();
        System.out.println("Rectangle Area: " + a);
    }
}

public class Main {
    public static void main(String[] args) {

        Circle c = new Circle("Red", 5);
        c.area();

        Rectangle r = new Rectangle("Blue", 4, 6);
        r.area();
    }
}