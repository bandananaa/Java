package workshop4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PrimeNumberTest {

    @Test
    public void testPrimeNumber() {
        assertTrue(PrimeNumber.isPrime(2), "2 should be prime.");
        assertTrue(PrimeNumber.isPrime(3), "3 should be prime.");
        assertTrue(PrimeNumber.isPrime(5), "5 should be prime.");
        assertTrue(PrimeNumber.isPrime(7), "7 should be prime.");
    }

    @Test
    public void testNonPrimeNumber() {
        assertFalse(PrimeNumber.isPrime(1), "1 is not prime.");
        assertFalse(PrimeNumber.isPrime(4), "4 is not prime.");
        assertFalse(PrimeNumber.isPrime(6), "6 is not prime.");
        assertFalse(PrimeNumber.isPrime(8), "8 is not prime.");
    }

    @Test
    public void testLargePrimeNumber() {
        assertTrue(PrimeNumber.isPrime(997), "997 should be prime.");
    }

    @Test
    public void testNegativeNumber() {
        assertFalse(PrimeNumber.isPrime(-5), "Negative numbers should not be prime.");
    }
}


