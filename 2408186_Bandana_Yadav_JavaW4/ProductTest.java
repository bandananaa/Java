package workshop4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ProductTest {

	@Test
    void testProductNameNotNull() {
        assertThrows(IllegalArgumentException.class, () -> new Product(null, 10.0, 1));
        assertThrows(IllegalArgumentException.class, () -> new Product("", 10.0, 1));
    }

    @Test
    void testPriceIsPositive() {
        assertThrows(IllegalArgumentException.class, () -> new Product("Product A", -10.0, 1));
        assertThrows(IllegalArgumentException.class, () -> new Product("Product A", 0, 1));
    }

    @Test
    void testIsAffordable() {
        Product product = new Product("Product B", 20.0, 2);

        assertAll(
            () -> assertTrue(product.isAffordable(50.0), "Should be affordable with a budget of 50.0"),
            () -> assertFalse(product.isAffordable(30.0), "Should not be affordable with a budget of 30.0"),
            () -> assertTrue(product.isAffordable(40.0), "Should be affordable with a budget of 40.0")
        );
    }
}

