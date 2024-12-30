package workshop4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringManipulatorTest {

    @Test
    public void testStringManipulator() {
        StringManipulator manipulator = new StringManipulator();

        // Test input
        String input = "madam";

        // Using assertAll to verify multiple methods
        assertAll("StringManipulator Tests",
            () -> assertEquals("madam", manipulator.reverse(input), "Reverse method failed"),
            () -> assertEquals("MADAM", manipulator.toUpperCase(input), "toUpperCase method failed"),
            () -> assertTrue(manipulator.isPalindrome(input), "isPalindrome method failed"),
            () -> assertEquals(2, manipulator.countVowels(input), "countVowels method failed")
        );
    }
}
