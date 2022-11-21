// if age is between 20-60 then store 'T' in char else store 'F'
public class OperatorDemo6
{
	public static void main(String ar[])
	{
		int age = 40;
		char ch = (age>=20) && (age<=60) ? 'T' : 'F';
		System.out.println(ch);
	}
}
