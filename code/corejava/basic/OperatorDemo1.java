public class OperatorDemo1
{
	public static void main(String ar[])
	{
		int a = 10;
		int b = 3;
		
		int ans = a*a + 2*a*b + b*b;

		int add = a + b;
		System.out.println("Add : " + add);  // 13
		System.out.println("Sub : " + (a-b));// 7
		System.out.println("Mul : " + (a*b));// 30
		System.out.println("Div : " + (a/b));// 3
		System.out.println("Mod : " + (a%b));// 1
		System.out.println("Formula : " + ans);		
		
	}
}