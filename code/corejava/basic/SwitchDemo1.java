/*
	define a day value in int
	if day=1,2,3,4,5  then print "Working Day"
	if day= 6,7 then print "Weekend"
	if any other value then print "Invalid Day"
*/

public class SwitchDemo1
{
	public static void main(String arr[])
	{
		int day = 7;
		switch(day)
		{
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("Working Day...");
				break;
			case 6:
			case 7:
				System.out.println("Weekend...");
				break;
			default:
				System.out.println("Invalid Day...");
		}
	}
}