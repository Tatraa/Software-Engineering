public class Zad5 {

    public static void main(String[] args) {
        Shape circle = new Circle(2);
        System.out.println(circle.getPerimeter() + " " + circle.getArea());

        Shape rectangle = new Rectangle(2, 3);
        System.out.println(rectangle.getPerimeter() + " " + rectangle.getArea());

        Shape triangle = new Triangle(3, 4, 5);
        System.out.println(triangle.getPerimeter() + " " + triangle.getArea());
    }
}

abstract class Shape {
    public abstract double getPerimeter();
    public abstract double getArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public double getArea() {
        double p = (a + b + c) / 2;
        double x = p * (p - a) * (p - b) * (p - c);
        return Math.sqrt(x);
    }
}
