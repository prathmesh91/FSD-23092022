import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		System.out.println(list.isEmpty());
		
		list.add(23);
		list.add("Abc");
		list.add("Pqr");
		list.add(23.45);
		list.add(23);
		list.add('A');
		list.add("Abc");
		
		System.out.println(list.isEmpty());
		
		System.out.println(list);
		
		System.out.println(list.remove("Abc"));
		System.out.println(list.contains("Abc"));
		System.out.println(list);
		System.out.println(list.size());
		list.clear();
		System.out.println(list);
		
		
		ArrayList l1 = new ArrayList();
		l1.add("Abc");
		l1.add(1234);
		l1.add(234.6);
		
		list.addAll(l1);
		
		System.out.println(list);
	}
}
