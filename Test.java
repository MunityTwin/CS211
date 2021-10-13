import java.util.ArrayList;

public class Test extends Abstract {
	@Override
	public void feed() {
		System.out.println("Feeded");
	}
    public static void main (String args[]) {
        ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(10);
		System.out.println(array.get(0));
		array.set(0, 15);
		System.out.println(array.get(0));
    }
}
