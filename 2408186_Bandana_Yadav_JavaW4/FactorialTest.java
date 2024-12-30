package workshop4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FactorialTest {

    @Test
    public void testFactorialBaseCases() {
        assertEquals(1, Factorial.calculateFactorial(0), "Factorial of 0 should be 1.");
        assertEquals(1, Factorial.calculateFactorial(1), "Factorial of 1 should be 1.");
    }

    @Test
    public void testFactorialOfSmallNumbers() {
        assertEquals(2, Factorial.calculateFactorial(2), "Factorial of 2 should be 2.");
        assertEquals(6, Factorial.calculateFactorial(3), "Factorial of 3 should be 6.");
        assertEquals(24, Factorial.calculateFactorial(4), "Factorial of 4 should be 24.");
    }

    @Test
    public void testFactorialOfLargerNumbers() {
        assertEquals(120, Factorial.calculateFactorial(5), "Factorial of 5 should be 120.");
        assertEquals(720, Factorial.calculateFactorial(6), "Factorial of 6 should be 720.");
    }

    @Test
    public void testFactorialOfLargeNumber() {
        assertEquals(39916800, Factorial.calculateFactorial(11), "Factorial of 11 should be 4037913.");
    }
}

