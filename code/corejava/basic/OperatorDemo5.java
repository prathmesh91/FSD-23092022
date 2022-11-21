public class OperatorDemo5
{
	public static void main(String ar[])
	{
		int a = 5;
		// a++; // post increment : a = a + 1
		++a; // pre increment : a = a + 1
		System.out.println(a); // 6

		int x = 10;
		//int y = x++;  // y = 10 (Assign, Increment, update)
		int y = ++x;  // (Increment, update, Assign)
		System.out.println(x); // 11
		System.out.println(y); // 11 

		int p = 15;
		int q = --p; // (decrement, update, Assign)  q=14, p=14
		int r = q--; // (Assign, decrement, update)  r=14, q=13
		System.out.println(p); // 14
		System.out.println(q); // 13 
		System.out.println(r); // 14		
	}
}