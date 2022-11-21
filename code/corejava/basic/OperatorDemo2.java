public class OperatorDemo2
{
	public static void main(String ar[])
	{
		int a = 10;
		int b = 3;
		
		a+=b;  //a = a + b;
		
		System.out.println(a);
		
		
		byte x = 10;
		int y = 5;
		//x = (byte) (x + y); // 15
		x+=y;  // x = x + y
		System.out.println("x+=y: " + x); // 15
		
		x-=y; // x = x - y 
		System.out.println("x-=y : " + x); // 10
		
		x*=y; // x = x * y
		System.out.println("x*=y : " + x);	 // 50	
		
		x/=y; // // x = x / y
		System.out.println("x/=y : " + x);	// 10	
		
	}
}