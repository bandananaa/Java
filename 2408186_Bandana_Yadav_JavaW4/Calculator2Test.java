package workshop4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

public class Calculator2Test {

    private Calculator2 calculator;

    // BeforeAll: Run once before any tests are executed
    @BeforeAll
    public static void setUpBeforeClass() {
        System.out.println("Global setup before any tests (if necessary).");
        // For example, you could load configuration or initialize static resources here.
    }

    // BeforeEach: Run before each test is executed
    @BeforeEach
    public void setUp() {
        calculator = new Calculator2();
        System.out.println("Initializing calculator for test...");
    }

    // Test cases for the calculator operations
    @Test
    public void testAddition() {
        assertEquals(5, calculator.add(2, 3), "Addition test failed");
    }

    @Test
    public void testSubtraction() {
        assertEquals(1, calculator.subtract(5, 4), "Subtraction test failed");
    }

    @Test
    public void testMultiplication() {
        assertEquals(6, calculator.multiply(2, 3), "Multiplication test failed");
    }

    @Test
    public void testDivision() {
        assertEquals(2.5, calculator.divide(5, 2), "Division test failed");
    }

    @Test
    public void testDivisionByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(5, 0);
        });
        assertEquals("Cannot divide by zero", exception.getMessage(), "Division by zero test failed");
    }

    // AfterEach: Run after each test is executed
    @AfterEach
    public void tearDown() {
        System.out.println("Test completed. Resetting states or printing message.");
        // Optionally reset calculator or any necessary states (not required in this case).
    }

    // AfterAll: Run once after all tests are executed
    @AfterAll
    public static void tearDownAfterClass() {
        System.out.println("Clean-up after all tests are done.");
        // Clean up any global resources, if necessary.
    }
}
