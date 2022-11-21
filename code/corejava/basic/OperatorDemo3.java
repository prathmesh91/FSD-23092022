public class OperatorDemo3
{
	public static void main(String ar[])
	{
		int a = 10;
		int b = 12;
		int c = 10;
		
		boolean ans = a > b;
		System.out.println("a > b : " + ans );
		System.out.println("a >= b : " + (a >= b) ); // false
		System.out.println("a >= c : " + (a >= c) ); // true
		
		System.out.println("a < b : " + (a < b) ); // true 
		System.out.println("a <= c : " + (a <= c) ); // true
		
		System.out.println("a == b : " + (a == b) ); // false
		System.out.println("a == c : " + (a == c) ); // true
		
		System.out.println("a != b : " + (a != b) ); // true
		System.out.println("a != c : " + (a != c) ); // false
	}

}