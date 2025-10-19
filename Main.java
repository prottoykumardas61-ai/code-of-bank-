class Shape {
}

class TwoD extends Shape {
}

class Circle extends TwoD {
    double r;

    static void area(double r) {
        System.out.println("Circle area = " + 3.1416 * r * r);
    }
}

class Square extends TwoD {
    double l;

    void area(double l) {
        System.out.println("Square area = " + l * l);
    }
}

class Triangle extends TwoD {
    double a, b;

    void area(double a, double b) {
        System.out.println("Triangle area = " + 0.5 * a * b);
    }
}

class ThreeD extends Shape {
}

class Sphere extends ThreeD {
    double r;

    void area(double r) {
        System.out.println("Sphere area = " + 4 * 3.1416 * r * r);
    }
}

class Cube extends ThreeD {
    double a;

    void area(double a) {
        System.out.println("Cube area = " + 6 * a * a);
    }
}

public class Main {
    public static void main(String[] args) {
        Circle.area(5);
        Square s = new Square();
        s.area(4);
        Triangle t = new Triangle();
        t.area(3, 6);
        Sphere sp = new Sphere();
        sp.area(2);
        Cube c = new Cube();
        c.area(3);
    }
}