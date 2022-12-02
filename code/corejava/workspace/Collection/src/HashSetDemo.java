import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(234);
		set.add("Abc");
		set.add('C');
		set.add(234);
		set.add("Abc");
		set.add("Xyz");
		System.out.println(set);
	}
}
