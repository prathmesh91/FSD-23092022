public class VariableDemo4
{
	int x;  // Instance Variable
	static int y = 222;  // static/class VariableDemo4

	public static void main(String ar[])
	{
		int z = -100;  // local VariableDemo4

		//System.out.println(x); // has to access by Object
		System.out.println(y);
		System.out.println(z);
	}
}