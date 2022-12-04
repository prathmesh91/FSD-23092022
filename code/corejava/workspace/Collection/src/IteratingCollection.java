import java.util.ArrayList;
import java.util.Iterator;

public class IteratingCollection {
	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<Double>();
			list.add(78.56);
			list.add(65.16);
			list.add(87.33);
			list.add(78.90);
			list.add(91.55);
			list.add(78.56);
			
		Iterator<Double> it = list.iterator();
		while(it.hasNext()) { // it use to check if next element present or not
			double value = it.next(); // can get the next value
			System.out.println(value);
		}
		
		System.out.println("----------------------------------");
		
		for(double value : list ) {
			System.out.println(value);
		}
	}
}
