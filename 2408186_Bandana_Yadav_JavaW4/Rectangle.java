package workshop4;

public class Rectangle {

    private double length;
    private double width;

    // Constructor to initialize length and width
    public Rectangle(double length, double width) {
        if (length < 0 || width < 0) {
            throw new IllegalArgumentException("Length and width cannot be negative.");
        }
        this.length = length;
        this.width = width;
    }

    // Method to calculate the area of the rectangle
    public double area() {
        return length * width;
    }

    // Method to calculate the perimeter of the rectangle
    public double perimeter() {
        return 2 * (length + width);
    }
}

