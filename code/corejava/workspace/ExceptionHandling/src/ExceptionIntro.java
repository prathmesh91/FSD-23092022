import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionIntro {
	public static void main(String[] args) {
		System.out.println("Main Method started...");
		
		int arr[] = {435,67,43,7,7843,87};
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Index : ");
		
		try {
			int index = scan.nextInt();
			System.out.println("The value is : " + arr[index]);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Sorry, The index you provided is not present..");
		}
		catch(InputMismatchException ex) {
			System.out.println("Please provide input in numeric format only...");
		}
		
		System.out.println("Main Method ends...");
	}
}
