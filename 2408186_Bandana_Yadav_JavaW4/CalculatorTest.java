package workshop4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testAdd() {
		Calculator calc = new Calculator();
		assertEquals(10,calc.add(8, 2));
		System.out.println("To check if addition function is working or not");
	}

}
