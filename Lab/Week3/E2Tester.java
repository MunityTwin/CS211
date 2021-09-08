// E2Tester.java
import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class E2Tester {
	public static void main(String[] args){
		org.junit.runner.JUnitCore.main("E2Tester");
	}

	int[] dataMakeSeqIn = {3, 10, 5, 1, 7};
	int[][] dataMakeSeqOut = {{1,1,2}, {1,1,2,3,5,8,13,21,34,55}, {1,1,2,3,5}, {1}, {1,1,2,3,5,8,13}};
	void checkMakeSequence(int a){
		int n = dataMakeSeqIn[a];
		int[] output = dataMakeSeqOut[a];
		String errMsg = String.format("makeSequence(%d) incorrect",n);
		assertArrayEquals(errMsg, output, FiboSequence.makeSequence(n));
	}

	@Test(timeout=1000) public void test_checkMakeSequence_00(){ checkMakeSequence(0); }
	@Test(timeout=1000) public void test_checkMakeSequence_01(){ checkMakeSequence(1); }
	@Test(timeout=1000) public void test_checkMakeSequence_02(){ checkMakeSequence(2); }
	@Test(timeout=1000) public void test_checkMakeSequence_03(){ checkMakeSequence(3); }
	@Test(timeout=1000) public void test_checkMakeSequence_04(){ checkMakeSequence(4); }
}