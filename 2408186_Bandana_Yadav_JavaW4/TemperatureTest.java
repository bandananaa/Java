package workshop4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TemperatureTest {

	@Test // run for testing annotation
	void testCelsiusToFahrenheit() {
		Temperature temperature = new Temperature();
		assertEquals(89.6,temperature.cel_to_fahren(32),0.001); // 0.001(third argument) is for precision which fives i decimal point.
		System.out.println("This method checks for conversion for a celsius to fahrenheit");
	}
	
	@Test
	void testFahrenheitToCelsius() {
		Temperature temperature = new Temperature();
		assertEquals(0, temperature.fahren_to_cel(32));
		System.out.println("This method checks for conversion for fahrenhiet to celsius");
	}

}
