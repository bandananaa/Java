package workshop4;

public class Factorial {

    // Function to calculate the factorial of a non-negative integer
    public static int calculateFactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }

        int result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i; // Multiply result by each number up to the input number
        }

        return result;
    }
}

