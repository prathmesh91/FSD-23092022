import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

public class HashtableDemo {
	public static void main(String[] args) {
		Hashtable map = new Hashtable();
		map.put(123, "Abc");
		map.put(12.45, "Xyz");
		map.put(123, "PQR");
		map.put("Abc", 123);
		map.put('A', 44.55);
		System.out.println(map);
		
		map.remove(123);
		//map.remove(123, "PQR");
		System.out.println(map.get(12.45));
		Set keys = map.keySet();
		System.out.println(keys);
		Collection values = map.values();
		System.out.println(values);
		
		System.out.println(map.containsKey(123));
		System.out.println(map.containsValue(123));
		
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		map.clear();
		System.out.println(map);
	}
}
