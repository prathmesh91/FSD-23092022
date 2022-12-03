import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap map = new TreeMap();
		map.put(123, "Abc");
		map.put(23, "A");
		map.put(12, "c");
		map.put(13, "b");
		map.put(11, "Ac");
		map.put(25, "bc");
		map.put(23, "Xyz");
		System.out.println(map);		
	}
}
