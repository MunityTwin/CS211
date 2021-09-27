import java.util.Scanner;
import java.util.ArrayList;

public class Test {
    public static void main (String args[]) {
        ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(10);
		System.out.println(array.get(0));
		array.set(0, 15);
		System.out.println(array.get(0));
    }
}
