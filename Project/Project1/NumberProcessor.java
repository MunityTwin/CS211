package Project.Project1;

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
		int numSteps = 0;
		// Repeat the game until the input reach 1
		while (input != 1) {
			if (input % 2 == 0) {
				input /= 2;
				++numSteps;
			}
			else {
				input = (input * 3) + 1;
				++numSteps;
			}
		}

		return numSteps;
	}

	/**
	 *
	 * This method marks off all the spots in the input array
	 * corresponding to composite numbers, leaving only the
	 * prime numbers as true.
	 */
	public static void sieveOfEratosthenes(boolean[] array){
		// If the array has less than 3 elements, modify all element
		// to false (the smallest prime number is 2)
		if (array.length < 3) {
			for (int i = 0; i < array.length; ++i) {
				array[i] = false;
			}
		}
		// If the array has at least 3 elements, check if it's prime
		// indices
		else {
			// Smallest prime number is 2
			array[0] = false;
			array[1] = false;

			for (int i = 2; i < array.length; ++i) {
				// Assume the index is a prime number, prove whether the
				// statement holds.
				array[i] = true;
				// Check if the index is a prime numbers
				for (int j = 2; j < i; ++j) {
					// If the index is divisible by j (other than itself),
					// the index is not a prime number
					if (i % j == 0) {
						array[i] = false;
					}
				}
			}
		}
	}

	/**
	 * Converts a Nx3 array to the equivalent rectangular array
	 */
	public static int[][] list2array(int[][] list) {
		// Find the total number of rows and columns in the new array
		int totalRow = 0;
		int totalCol = 0;
		int[][] result;

		// The second column of the Nx3 array holds the row position
		// The third column of the Nx3 array holds the col position
		// The highest index of rows and columns in the new array will
		// be the highest number found in the Nx3 array
		for (int i = 0; i < list.length; ++i) {
			if (list[i][1] > totalRow) {
				totalRow = list[i][1];
			}
			if (list[i][2] > totalCol) {
				totalCol = list[i][2];
			}
		}
		// Increment totalRow and totalCol by 1 to find the total
		++totalRow;
		++totalCol;

		// Create the new array, initialize all element to 0
		result = new int[totalRow][totalCol];
		for (int i = 0; i < totalRow; ++i) {
			for (int j = 0; j < totalCol; ++j) {
				result[i][j] = 0;
			}
		}
		
		// Modify the result with the corresponding value in Nx3 array
		for (int i = 0; i < list.length; ++i) {
			result[list[i][1]][list[i][2]] = list[i][0];
		}

		return result;
	}

	/**
	 * Unfolds the array in a spiral order clockwise starting from index 0,0
	 */
	public static int[] spiralUnfolding(int[][] array){
		// Find the total numbers of rows and columns
		int totalRow = array.length;
		int totalCol = array[0].length;
		// Initialize the result array that can hold all elements in the 2D array
		int[] result = new int[totalRow * totalCol];

		// Unfold the array, keep track of the current index on the result array
		// Stop folding when all number has been tracked
		int index = 0;
		while (index < result.length) {
			// Initialize a variable to keep track of the current spiral ring
			int spiralRing = 0;
			// For each spiral ring, we perform 4 operations
			// Move right
			for (int i = 0; i < totalCol; ++i) {
				result[index] = array[0][i];
				++index;
			}

			// Move downward
			for (int j = 0; j < totalRow; ++j) {
				result[index] = array[j][totalCol - 1];
				++index;
			}

			//
		}
	}

	/**
	 * Even numbers are rotated to the right.
	 * Odd numbers are rotated to the left.
	 */
	public static void arrayRotation(int[] array){
		// Shift all even numbers to the right
		int firstEvenIndex = -1;
		int prevEvenIndex = -1;
		int tempEvenVal = 0;
		for (int i = 0; i < array.length; ++i) {
			if (array[i] % 2 == 0) {
				// Check if it's the first occurence
				if (firstEvenIndex == -1) {
					firstEvenIndex = i;
					prevEvenIndex = i;
					continue;
				}
				tempEvenVal = array[i];
				array[i] = array[prevEvenIndex];
				prevEvenIndex = i;
			}
		}
		// Move the last even number to the first occurence position
		// if there are at least 2 even numbers in the array
		if (firstEvenIndex != prevEvenIndex) {
			array[firstEvenIndex] = tempEvenVal;
		}

		// Shift all even numbers to the right
		int firstOddIndex = -1;
		int prevOddIndex = -1;
		int tempOddVal = 0;
		for (int i = array.length - 1; i >= 0; --i) {
			if (array[i] % 2 == 1) {
				// Check if it's the first occurence
				if (firstOddIndex == -1) {
					firstOddIndex = i;
					prevOddIndex = i;
					continue;
				}
				tempOddVal = array[i];
				array[i] = array[prevOddIndex];
				prevOddIndex = i;
			}
		}
		// Move the last odd number to the first occurence position
		// if there are at least 2 odd numbers in the array
		if (firstOddIndex != prevOddIndex) {
			array[firstEvenIndex] = tempOddVal;
		}
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
		System.out.println("Method 1:");
		System.out.println(isCoprime(4, 9));
		System.out.println(isCoprime(7, 49));
		System.out.println();

		System.out.println("Method 2:");
		System.out.println(isPalindrome(12321));
		System.out.println(isPalindrome(123221));
		System.out.println();

		System.out.println("Method 3:");
		System.out.println(isFibonacciPrime(5));
		System.out.println(isFibonacciPrime(8));
		System.out.println();

		System.out.println("Method 4:");
		System.out.println(countCollatzSteps(97));
		System.out.println(countCollatzSteps(1));
		System.out.println();
		
		System.out.println("Method 5:");
		boolean[] arr1 = {true, true, false, true, false, false};
		sieveOfEratosthenes(arr1);
		for (int i = 0; i < arr1.length; ++i) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		boolean[] arr2 = {true, false, false};
		sieveOfEratosthenes(arr2);
		for (int i = 0; i < arr2.length; ++i) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println("\n");

		System.out.println("Method 6:");
		int[][] arr3 = {{7,2,5},{1,0,2},{-4,3,3}};
		int[][] result1 = list2array(arr3);
		for (int i = 0; i < result1.length; ++i) {
			for (int j = 0; j < result1[i].length; ++j) {
				System.out.print(result1[i][j] + " ");
			}
			System.out.print(",");
		}
		System.out.println();
		int[][] arr4 = {{1,0,0},{2,0,1},{3,1,0},{4,1,1}};
		int[][] result2 = list2array(arr4);
		for (int i = 0; i < result2.length; ++i) {
			for (int j = 0; j < result2[i].length; ++j) {
				System.out.print(result2[i][j] + " ");
			}
			System.out.print(",");
		}
		System.out.println("\n");
		
		System.out.println("Method 8:");
		int[] arr5 = {1,2,3,4,5,6,7,8,9};
		arrayRotation(arr5);
		for (int i = 0; i < arr5.length; ++i) {
			System.out.print(arr5[i] + " ");
		}
		System.out.println();
		int[] arr6 = {5,7,1,6,8,3};
		arrayRotation(arr6);
		for (int i = 0; i < arr6.length; ++i) {
			System.out.print(arr6[i] + " ");
		}
		System.out.println("\n");
	}

}
