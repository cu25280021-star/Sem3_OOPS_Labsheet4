abstract class Shape {
    public abstract double calculateArea();
    public abstract void displayArea();
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public void displayArea() {
        System.out.println("Rectangle Area: " + calculateArea());
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void displayArea() {
        System.out.printf("Circle Area: %.2f\n", calculateArea());
    }
}

public class ShapeHierarchyMain {
    public static void main(String[] args) {
        Shape rect = new Rectangle(5.0, 4.0);
        Shape circle = new Circle(3.0);

        rect.displayArea();
        circle.displayArea();
    }
}