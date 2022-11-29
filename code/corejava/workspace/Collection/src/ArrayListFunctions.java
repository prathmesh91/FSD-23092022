import java.util.ArrayList;

public class ArrayListFunctions {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Abc");
		list.add("Pqr");
		list.add("Lmn");
		System.out.println(list);
		list.add(1, "Xyz");
		System.out.println(list);
		System.out.println(list.get(3));
		list.remove(2);
		System.out.println(list);
		list.set(0, "Test");
		System.out.println(list);
		
	}
}
