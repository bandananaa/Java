package workshop4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductTest2 {

    @Test
    void testProductNameNotNull() {
        assertThrows(IllegalArgumentException.class, () -> new Product2(null, 10.0, 1));
        assertThrows(IllegalArgumentException.class, () -> new Product2("", 10.0, 1));
    }

    @Test
    void testPriceIsPositive() {
        assertThrows(IllegalArgumentException.class, () -> new Product2("Product A", -10.0, 1));
        assertThrows(IllegalArgumentException.class, () -> new Product2("Product A", 0, 1));
    }

    @Test
    void testIsAffordable() {
        Product2 product = new Product2("Product B", 20.0, 2);

        assertAll(
            () -> assertTrue(product.isAffordable(50.0), "Should be affordable with a budget of 50.0"),
            () -> assertFalse(product.isAffordable(30.0), "Should not be affordable with a budget of 30.0"),
            () -> assertTrue(product.isAffordable(40.0), "Should be affordable with a budget of 40.0")
        );
    }

    @Test
    void testIsProductAvailable() {
        Product2 product = new Product2("Product C", 15.0, 10);

        assertAll(
            () -> assertTrue(product.isProductAvailable("Product C", 5), "Should be available for quantity 5"),
            () -> assertFalse(product.isProductAvailable("Product C", 15), "Should not be available for quantity 15"),
            () -> assertFalse(product.isProductAvailable("Nonexistent Product", 5), "Should not be available for a nonexistent product")
        );
    }
}
