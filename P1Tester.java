
/** Example of using unit tests for this assignment.  To run them on the command line, make
 * sure that the junit-cs211.jar is in the same directory.
 *
 * On Mac/Linux:
 *  javac -cp .:junit-cs211.jar *.java         # compile everything
 *  java -cp .:junit-cs211.jar P1Tester        # run tests
 *
 * On windows replace colons with semicolons: (: with ;)
 *  demo$ javac -cp .;junit-cs211.jar *.java   # compile everything
 *  demo$ java -cp .;junit-cs211.jar P1Tester  # run tests
 */
/*
import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class P1Tester {
  public static void main(String args[]){
    org.junit.runner.JUnitCore.main("P1Tester");
  }

  int[][] dataCoprime = {{3,5},{2,4},{7,15},{17,257},{30,11},};
  boolean[] resCoprime = {true, false, true, true, true};

  void checkIsCoprime(int a) {
	  int first = dataCoprime[a][0];
    int second = dataCoprime[a][1];
	  boolean result = resCoprime[a];
	  String errMsg = String.format("isCoprime(%d,%d) incorrect", first,second);
	  assertEquals(errMsg, result, NumberProcessor.isCoprime(first,second));
  }

  @Test(timeout=1000) public void isCoprime_00() { checkIsCoprime(0); }
  @Test(timeout=1000) public void isCoprime_01() { checkIsCoprime(1); }
  @Test(timeout=1000) public void isCoprime_02() { checkIsCoprime(2); }
  @Test(timeout=1000) public void isCoprime_03() { checkIsCoprime(3); }
  @Test(timeout=1000) public void isCoprime_04() { checkIsCoprime(4); }

  int[] dataPalindrome = {1,2,34,55655,77};
  boolean[] resPalindrome = {true,true,false,true,true};

  void checkIsPalindrome(int a) {
    int first = dataPalindrome[a];
    boolean result = resPalindrome[a];
    String errMsg = String.format("isPalindrome(%d) incorrect", first);
    assertEquals(errMsg, result, NumberProcessor.isPalindrome(first));
  }

  @Test(timeout=1000) public void isPalindrome_00() { checkIsPalindrome(0); }
  @Test(timeout=1000) public void isPalindrome_01() { checkIsPalindrome(1); }
  @Test(timeout=1000) public void isPalindrome_02() { checkIsPalindrome(2); }
  @Test(timeout=1000) public void isPalindrome_03() { checkIsPalindrome(3); }
  @Test(timeout=1000) public void isPalindrome_04() { checkIsPalindrome(4); }

  long[] dataFibPrime = {2L, 3L, 5L, 7L, 8L, 13L};
  boolean[] resFibPrime = {true, true, true, false, false, true};

  void checkIsFibPrime(int a){
    long first = dataFibPrime[a];
    boolean result = resFibPrime[a];
    String errMsg = String.format("isFibonacciPrime(%d) incorrect", first);
    assertEquals(errMsg, result, NumberProcessor.isFibonacciPrime(first));
  }

  @Test(timeout=1000) public void isFibPrime_00() { checkIsFibPrime(0); }
  @Test(timeout=1000) public void isFibPrime_01() { checkIsFibPrime(1); }
  @Test(timeout=1000) public void isFibPrime_02() { checkIsFibPrime(2); }
  @Test(timeout=1000) public void isFibPrime_03() { checkIsFibPrime(3); }
  @Test(timeout=1000) public void isFibPrime_04() { checkIsFibPrime(4); }

  int[] dataCollatz = {9,97,27,1,7};
  int[] resCollatz = {19, 118, 111, 0, 16};

  void checkCountCollatzSteps(int a){
    int first = dataCollatz[a];
    int result = resCollatz[a];
    String errMsg = String.format("countCollatzSteps(%d) incorrect", first);
    assertEquals(errMsg, result, NumberProcessor.countCollatzSteps(first));
  }

  @Test(timeout=1000) public void countSteps_00() { checkCountCollatzSteps(0); }
  @Test(timeout=1000) public void countSteps_01() { checkCountCollatzSteps(1); }
  @Test(timeout=1000) public void countSteps_02() { checkCountCollatzSteps(2); }
  @Test(timeout=1000) public void countSteps_03() { checkCountCollatzSteps(3); }
  @Test(timeout=1000) public void countSteps_04() { checkCountCollatzSteps(4); }

  boolean[][] resSieve = {
    {false},
    {false,false,true},
    {false,false,true,true},
    {false,false,true,true,false,true},
    {false,false,true,true,false,true,false,true,false,false,false}};

  void checkSieve(int a){
    boolean[] passedIn = new boolean[resSieve[a].length];
    NumberProcessor.sieveOfEratosthenes(passedIn);
    String errMsg = String.format("sieveOfEratosthenes(%d) incorrect", resSieve[a].length);
    assertArrayEquals(errMsg,resSieve[a],passedIn);
  }

  @Test(timeout=1000) public void checkSieve_00() { checkSieve(0); }
  @Test(timeout=1000) public void checkSieve_01() { checkSieve(1); }
  @Test(timeout=1000) public void checkSieve_02() { checkSieve(2); }
  @Test(timeout=1000) public void checkSieve_03() { checkSieve(3); }
  @Test(timeout=1000) public void checkSieve_04() { checkSieve(4); }


  void testList2Array(int n, int[][] input, int[][] expected) {
	  String errMsg = String.format("testList2Array(%d) incorrect", n);
	  assertArrayEquals(errMsg, expected, NumberProcessor.list2array(input));
  }

  @Test(timeout=1000) public void test_list2array_00() { testList2Array(0, new int[][]{{7,2,5},{1,0,2},{-4,3,3}}, new int[][]{{0,0,1,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,7},{0,0,0,-4,0,0}});  }
  @Test(timeout=1000) public void test_list2array_01() { testList2Array(1, new int[][]{{-8,4,3}}, new int[][]{{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,-8}});  }
  @Test(timeout=1000) public void test_list2array_02() { testList2Array(2, new int[][]{{1,0,0},{2,0,1},{3,1,0},{4,1,1}}, new int[][]{{1,2},{3,4}});  }

  void testSpiralUnfolding(int n, int[][] input, int[] expected) {
	  String errMsg = String.format("test_spiralunfolding(%d) incorrect", n);
	  assertArrayEquals(errMsg, expected, NumberProcessor.spiralUnfolding(input));
  }

  @Test(timeout=1000) public void test_spiralunfolding_00() { testSpiralUnfolding(0, new int[][]{{1,2,3},{4,5,6},{7,8,9}}, new int[]{1,2,3,6,9,8,7,4,5}); }
  @Test(timeout=1000) public void test_spiralunfolding_01() { testSpiralUnfolding(1, new int[][]{{1,2},{3,4},{5,6},{7,8},{9,10}}, new int[]{1,2,4,6,8,10,9,7,5,3}); }
  @Test(timeout=1000) public void test_spiralunfolding_02() { testSpiralUnfolding(2, new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}}, new int[]{1,2,3,4,5,10,15,20,19,18,17,16,11,6,7,8,9,14,13,12}); }

  void testArrayRotation(int n, int[] input, int[] expected) {
	  NumberProcessor.arrayRotation(input);
	  String errMsg = String.format("test_arrayrotation(%d) incorrect", n);
	  assertArrayEquals(errMsg, expected, input);
  }

  @Test(timeout=1000) public void test_arrayrotation_00() { testArrayRotation(0, new int[]{1,2,3,4,5,6,7,8,9}, new int[]{3,8,5,2,7,4,9,6,1}); }
  @Test(timeout=1000) public void test_arrayrotation_01() { testArrayRotation(1, new int[]{8,2,6,12,4}, new int[]{4,8,2,6,12}); }
  @Test(timeout=1000) public void test_arrayrotation_02() { testArrayRotation(2, new int[]{5,7,1,6,8,3}, new int[]{7,1,3,8,6,5}); }


  void testRemoveConsecutives(int n, int[][] input, int[][] expected) {
	  String errMsg = String.format("test_removeconsecutives(%d) incorrect", n);
	  assertArrayEquals(errMsg, expected, NumberProcessor.removeConsecutives(input));
  }

  @Test(timeout=1000) public void test_removeconsecutives_00() { testRemoveConsecutives(0, new int[][]{{1,2,3,4,5},{6,7,8,9}}, new int[][]{{1,2,3,4,5},{6,7,8,9}}); }
  @Test(timeout=1000) public void test_removeconsecutives_01() { testRemoveConsecutives(1, new int[][]{{1,2,2,2,3,4,5,5},{6,7,8,8,8,9}}, new int[][]{{1,2,3,4,5},{6,7,8,9}}); }
  @Test(timeout=1000) public void test_removeconsecutives_02() { testRemoveConsecutives(2, new int[][]{{1,2,2,2,3,4,5,5},{5,5,5,5}}, new int[][]{{1,2,3,4,5}}); }


  void testReplaceItem(int n, int[][] input, int[][] expected, int item, int[] replacement) {
	  NumberProcessor.replaceItem(input, item, replacement);
	  String errMsg = String.format("test_replaceitem(%d) incorrect", n);
	  assertArrayEquals(errMsg, expected, input);
  }

  @Test(timeout=1000) public void test_replaceitem_00() { testReplaceItem(0, new int[][]{{1,2,3,4,5},{6,7,8,9}}, new int[][]{{1,0,-1,3,4,5},{6,7,8,9}}, 2, new int[]{0,-1}); }
  @Test(timeout=1000) public void test_replaceitem_01() { testReplaceItem(1, new int[][]{{1,2,3,4,5},{5,4,3,2}}, new int[][]{{1,2,3,4,-5,5},{-5,5,4,3,2}}, 5, new int[]{-5,5}); }
  @Test(timeout=1000) public void test_replaceitem_02() { testReplaceItem(2, new int[][]{{1,2,3,4,5},{5,4,3,4}}, new int[][]{{1,2,3,1,2,3,5},{5,1,2,3,3,1,2,3}}, 4, new int[]{1,2,3}); }

}
*/