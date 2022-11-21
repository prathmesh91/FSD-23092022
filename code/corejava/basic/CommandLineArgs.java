public class CommandLineArgs
{
	public static void main(String arr[])
	{
		System.out.println("Name : " + arr[0]);
		System.out.println("Number-1 : " + arr[1]);
		System.out.println("Number-2 : " + arr[2]);
		
		int num1 = Integer.parseInt(arr[1]);
		int num2 = Integer.parseInt(arr[2]);
		
		System.out.println("Addition : " + (num1 + num2));
	}
}