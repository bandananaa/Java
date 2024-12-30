package workshop4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ShapeTest {

    @Test
    public void testCircleArea() {
        Circle circle = new Circle(5);
        assertEquals(78.53981633974483, circle.area(), 0.0001, "Area of circle with radius 5 should be approximately 78.54.");
    }

    @Test
    public void testRectangle2Area() {
        Rectangle2 rectangle2 = new Rectangle2(4, 6);
        assertEquals(24, rectangle2.area(), "Area of rectangle with length 4 and width 6 should be 24.");
    }

    @Test
    public void testShapeArea() {
        Shape shape = new Shape();
        assertEquals(0, shape.area(), "The area of a generic Shape should be 0.");
    }
}

