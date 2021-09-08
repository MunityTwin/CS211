public class NumberProcessor {
	/**
	*
	* This method returns true if the two inputs are coprime - sharing no divisors other than 1
	*
	*
	*/
	public static boolean isCoprime(int input1, int input2) {
		while (input1 != input2) {
			if (input1 >= input2) {
				input1 -= input2;
			}
			else {
				input2 -= input1;
			}
		}

		// If the end result is 1, the two numbers are not multiples of an integer other than 1, return true
		if (input1 == 1) {
			return true;
		}
		return false;
	}

	/**
	*
	* This method returns true if the number is palindrome - a number whose digits are the same when read backwards and forwards.
	*
	*
	*/
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

	/**
	*
	* This method returns true if the input is a Fibonacci Prime
	*
	*
	*/
	public static boolean isFibonacciPrime(long input) {
		// Test whether the number is a prime number
		// Smallest prime number is 2
		if (input <= 1) {
			return false;
		}
		else {
			// Iterate i from 2 to n - 1
			// If input is divisible by i (other than itself), return false. Otherwise, input is a prime number
			for (int i = 2; i < input; i++) {
				if (input % i == 0) {
					return false;
				}
			}
		}

		// Test whether the number is part of the Fibonacci sequence
		// A number is Fibonacci if one or both of (5*n^2 + 4) or (5*n^2 - 4) is a perfect square.
		// Calculate the expression
		int n1 = (int)(5 * Math.pow(input, 2) + 4);
		int n2 = (int)(5 * Math.pow(input, 2) - 4);

		// Calculate the square root
		int sqrt1 = (int)Math.sqrt(n1);
		int sqrt2 = (int)Math.sqrt(n2);

		// Check if the expression is a perfect square
		if (sqrt1 * sqrt1 == n1 || sqrt2 * sqrt2 == n2) {
			return true;
		}
		return false;
	}

	/**
	 *
	 * This method returns the number of steps it takes to get to 1
	 * following the collatz game rules starting at the input
	 */
	public static int countCollatzSteps(int input){
		// DELETE THE LINE BELOW ONCE YOU IMPLEMENT THE CALL!
		throw new RuntimeException("not implemented!");
	}

	/**
	 *
	 * This method marks off all the spots in the input array
	 * corresponding to composite numbers, leaving only the
	 * prime numbers as true.
	 */
	public static void sieveOfEratosthenes(boolean[] array){
		// DELETE THE LINE BELOW ONCE YOU IMPLEMENT THE CALL!
		throw new RuntimeException("not implemented!");
	}

	/**
	 * Converts a Nx3 array to the equivalent rectangular array
	 */
	 public static int[][] list2array(int[][] list) {
		// DELETE THE LINE BELOW ONCE YOU IMPLEMENT THE CALL!
		throw new RuntimeException("not implemented!");
	}

	/**
	 * Unfolds the array in a spiral order clockwise starting from index 0,0
	 */
	public static int[] spiralUnfolding(int[][] array){
		// DELETE THE LINE BELOW ONCE YOU IMPLEMENT THE CALL!
		throw new RuntimeException("not implemented!");
	}

	/**
	 * Even numbers are rotated to the right.
	 * Odd numbers are rotated to the left.
	 */
	public static void arrayRotation(int[] array){
		// DELETE THE LINE BELOW ONCE YOU IMPLEMENT THE CALL!
		throw new RuntimeException("not implemented!");
	}

	/**
	 * Returns a new array where every sequence of consecutive numbers is
	 * replaced by a single occurrence of the respective number
	 */
	public static int[][] removeConsecutives(int[][] array){
		// DELETE THE LINE BELOW ONCE YOU IMPLEMENT THE CALL!
		throw new RuntimeException("not implemented!");
	}

	/**
	 * Modifies a two-dimensional array in-place. Every occurrence of item
	 * is replaced by replacement.
	 */
	public static void replaceItem(int[][] array, int item, int[] replacement){
		// DELETE THE LINE BELOW ONCE YOU IMPLEMENT THE CALL!
		throw new RuntimeException("not implemented!");
	}

	/**
	 *
	 * Main method. Is not tested by the tester, create your own tests here!
	 */
	public static void main(String[] args){
		//pass
	}

}
