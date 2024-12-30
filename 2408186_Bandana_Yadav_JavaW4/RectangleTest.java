package workshop4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RectangleTest {

    @Test
    public void testArea() {
        Rectangle rectangle = new Rectangle(5, 3);
        assertEquals(15, rectangle.area(), "Area of rectangle with length 5 and width 3 should be 15.");

        rectangle = new Rectangle(10, 2);
        assertEquals(20, rectangle.area(), "Area of rectangle with length 10 and width 2 should be 20.");
    }

    @Test
    public void testPerimeter() {
        Rectangle rectangle = new Rectangle(5, 3);
        assertEquals(16, rectangle.perimeter(), "Perimeter of rectangle with length 5 and width 3 should be 16.");

        rectangle = new Rectangle(10, 2);
        assertEquals(24, rectangle.perimeter(), "Perimeter of rectangle with length 10 and width 2 should be 24.");
    }

    @Test
    public void testRectangleWithZeroDimensions() {
        Rectangle rectangle = new Rectangle(0, 3);
        assertEquals(0, rectangle.area(), "Area of rectangle with length 0 and width 3 should be 0.");
        assertEquals(6, rectangle.perimeter(), "Perimeter of rectangle with length 0 and width 3 should be 6.");

        rectangle = new Rectangle(5, 0);
        assertEquals(0, rectangle.area(), "Area of rectangle with length 5 and width 0 should be 0.");
        assertEquals(10, rectangle.perimeter(), "Perimeter of rectangle with length 5 and width 0 should be 10.");
    }

    @Test
    public void testNegativeDimensions() {
        // Testing invalid negative values (optional, based on implementation logic)
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(-5, 3), "Length cannot be negative.");
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(5, -3), "Width cannot be negative.");
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(-5, -3), "Length and width cannot be negative.");
    }
}

