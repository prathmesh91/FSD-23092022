public class OperatorDemo4
{
	public static void main(String ar[])
	{	
		int x = 200;
		
		boolean ans = (x >= 1) & (x <=50);
		System.out.println(ans); // false
		
		int a = 10;
		int b = 15;
		System.out.println("a & b : " + (a & b)); // 10
		
		/*
		10 -> 1 0 1 0
		&
		15 -> 1 1 1 1
		==============
		10 -> 1 0 1 0
		*/
		
		boolean ans2 = (x >= 1) | (x <=50);
		System.out.println(ans2); // true
		
		System.out.println("a | b : " + (a | b)); // 15
		
		
		System.out.println("=====================");
		
		
		int p = 22;
		int q = 20;
		
		System.out.println(" &  : " + ((q > p) & (p > 10)));  // F & T = F
		System.out.println(" &&  : " + ((q > p) && (p > 10)));  // F
		
		System.out.println(" &&  : " + ((q < p) || (p > 10)));  // T  = T
		
	}
	
}