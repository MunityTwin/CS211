import java.util.Scanner;

public class Test {
    
    public static boolean isPalindrome(int input) {
	    int numDigits = 1; //There will always be at least 1 digit
		// If the input has more than 1 digit (>= 10), calculate the total number of digits
		for (int i = input; i >= 10; i /= 10) {
			++numDigits;
		}

		// Initialize an array to hold individual digit, knowing the total number of digits in input
		int[] arrDigits = new int[numDigits];

		// Extract the last digit from input and put it in array (reversing the order)
		for (int i = 0; i < numDigits; i++) {
			arrDigits[i] = input % 10;
			input /= 10;
		}

		// Compare each pair of elements in the array (if the array has 10 elements, check pair (1st, 10th), (2nd, 9th), (3rd, 8th),...)
		// until reaching the middle position
		// Return true if the two elements are equal in all pairs, otherwise false
		for (int i = 0; i < numDigits / 2; i++) {
			if (arrDigits[i] != arrDigits[numDigits - i - 1]) {
				return false;
			}
		}
		return true;
	}

    public static void main (String args[]) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter your number:");
        int input = scnr.nextInt();
        System.out.print(isPalindrome(input));
    }
}
