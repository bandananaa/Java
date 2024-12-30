package workshop4;

public class StringManipulator {

    // Method to reverse the input string
    public String reverse(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }

    // Method to convert all characters to uppercase
    public String toUpperCase(String input) {
        return input.toUpperCase();
    }

    // Method to check if the input string is a palindrome
    public boolean isPalindrome(String input) {
        String reversed = reverse(input);
        return input.equals(reversed);
    }

    // Method to count the number of vowels in the input string
    public int countVowels(String input) {
        int count = 0;
        for (char c : input.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
}