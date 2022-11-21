public class Calculation
{
	public static void main(String args[])
	{
		Calculation cal = new Calculation();
		int value = cal.getAge(1998); // calling a method.
		System.out.println(value);

		cal.getAddition(11,22,10);
	}
	
	public int getAge(int year) 
	{
		int currentYear = 2022;
		int age = currentYear - year;
		return age; // to return the output from the method
	}

	public void getAddition(int num1, int num2, int num3) 
	{
		int ans = num1 + num2 + num3;
		System.out.println("Addition : " + ans);
	}

}

	