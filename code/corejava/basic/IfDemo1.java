public class IfDemo1 {
	public static void main(String ar[])
	{
		int percent = 33;
		// percent must be grater than 40 and less than 100
		if(percent>=40 && percent<=100) {
			System.out.println("Congrates...!!!");
			if(percent>=75 && percent<=100) {
				System.out.println("You got Distinction");
			}
			else if(percent>=60 && percent<75){
				System.out.println("You got First Class");
			} 
			else if(percent>=50 && percent<60) {
				System.out.println("You got Second Class");
			} else {
				System.out.println("You got Pass class");
			}
		}
		else if(percent>=0 && percent<40) {
			System.out.println("Sorry!!!");
			System.out.println("Fail");
		} 
		else {
			System.out.println("Invalid Percentage");
		}
	}
}