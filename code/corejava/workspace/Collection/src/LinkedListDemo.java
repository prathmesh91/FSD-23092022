import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(123);
		list.add("Abc");
		list.add(1.23);
		System.out.println("Original List : "+ list);
		
		System.out.println(list.get(1));
		
		list.push("Xyz"); // Add element at first position
		System.out.println("After Push : "+list);
		
		System.out.println(list.pop());// select and remove the first element
		System.out.println("After Pop : "+list);
		
		// select the first element but not removes it, if 1st element is not present
		// them it will return null
		System.out.println(list.peek()); 
		System.out.println("After Peek : "+list);
		
		// select and removes the first element. it will return null if no first element present.
		System.out.println(list.poll());
		System.out.println("After Poll : "+list);
		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		System.out.println(list.removeFirst());
		System.out.println(list.removeLast());
		System.out.println(list);
		
		
	}
}
