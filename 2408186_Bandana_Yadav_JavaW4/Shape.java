package workshop4;

public class Shape {
    // Base class method that returns 0 by default
    public double area() {
        return 0;
    }
}

class Circle extends Shape {
    private double radius;

    // Constructor to initialize the radius of the circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // Overridden area method to calculate the area of the circle
    @Override
    public double area() {
        return Math.PI * radius * radius; // Area of a circle: π * radius^2
    }
}

class Rectangle2 extends Shape {
    private double length;
    private double width;

    // Constructor to initialize the length and width of the rectangle
    public Rectangle2(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overridden area method to calculate the area of the rectangle
    @Override
    public double area() {
        return length * width; // Area of a rectangle: length * width
    }
}


