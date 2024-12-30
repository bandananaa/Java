package workshop4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class NumberUtilsTest {

	@Test
	public void testGetEvenNumbers() {
        int[] input = {1, 2, 3, 4, 5, 6};
        List<Integer> expectedOutput = List.of(2, 4, 6);
        List<Integer> actualOutput = NumberUtils.getEvenNumbers(input);
        assertEquals(expectedOutput, actualOutput, "The method should return only even numbers.");
    }

}
