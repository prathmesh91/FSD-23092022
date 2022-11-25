import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchFinally {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("Enter 1st Value: ");
			int num1 = scan.nextInt();
			System.out.println("Enter 2nd Value: ");
			int num2 = scan.nextInt();
			
			int div = num1 / num2;
			System.out.println("The Division is : " + div);
		} catch(InputMismatchException | ArithmeticException ex) { // JDK 1.7 and Onwards
			System.out.println("Something went wrong. please try after sometime.");
			System.out.println(ex.getClass());
			System.out.println(ex.getMessage());
		} finally { // finally is used to close the resources.
			scan.close();
		}
		
		System.out.println("End Of the Operation....");
	}
}
