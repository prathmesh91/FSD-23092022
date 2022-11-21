import java.util.Scanner;

public class ScannerDemo
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Name : ");
		String name = scan.next();
		
		System.out.println("Enter 1st Number : ");
		int num1 = scan.nextInt();
		
		System.out.println("Enter 2nd Number : ");
		double num2 = scan.nextDouble();
		
		System.out.println("Name : " + name);
		System.out.println("Addition : " + (num1 + num2));
	}
}