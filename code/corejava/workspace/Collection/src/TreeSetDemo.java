import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(45);
		set.add(65);
		set.add(12);
		set.add(22);
		set.add(123);
		set.add(12);
		set.add(11);
		
		System.out.println(set); //[11, 12, 22, 45, 65, 123]
		System.out.println(set.descendingSet()); //[123, 65, 45, 22, 12, 11]
		
		System.out.println(set.first());
		System.out.println(set.last());
		
		System.out.println(set.higher(22));//return the higher value than the provided
		System.out.println(set.lower(22));//return the lower value than the provided
		
		System.out.println(set.ceiling(22));//return the equal or higher value than the provided
		System.out.println(set.floor(22));//return the equal or lower value than the provided
		
		System.out.println(set.tailSet(45));// return the values which after given value(give value also included)
		System.out.println(set.headSet(45));// return the values which is before given value(given value will not be included)
	}
}
