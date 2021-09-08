// FiboSequence.java
public class FiboSequence {

	/**
	 * This method takes a positive integer n and returns an integer
	 * array with the first n terms of the Fibonacci sequence.
	 */
	public static int[] makeSequence(int n){
		// Declare the first two values in the Fibonacci sequence and an 
		// empty array of n elements
		int n1 = 1;
		int n2 = 1;
		int temp = 0; // Temporary value for updating n1 and n2
		int[] result = new int[n];
		
		for (int i = 0; i < result.length; ++i) {
			// Add element n1 to the result array
			result[i] = n1;
			// Update n1 and n2 (n1 = n2 and n2 = n1 + n2)
			temp = n2;
			n2 += n1;
			n1 = temp;
		}

		return result;
	}

	/**
	 * You may perform your own tests in the main method if you prefer. 
	 * The main method will not be run by the tester.
	 */
	public static void main(String[] args){
		int[] result = makeSequence(10);
		for (int i = 0; i < result.length; ++i) {
			System.out.print(result[i] + " ");
		}
	}
}