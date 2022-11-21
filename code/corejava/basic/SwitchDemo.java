/*
	'M' = Monday
	'T' = Tuesday
	'W' = Wednesday
	'S' = Saturday
*/


public class SwitchDemo
{
	public static void main(String arr[])
	{
		char ch = 'S';
		
		switch(ch)
		{
			case 'M':
				System.out.println("Monday");
				break;
			case 'T':
				System.out.println("Tuesday");
				break;
			case 'W':
				System.out.println("Wednesday");
				break;
			case 'S':
			case 's':
				System.out.println("Saturday");
				break;
			default:
				System.out.println("Invalid Day");
			
		}
	}
}