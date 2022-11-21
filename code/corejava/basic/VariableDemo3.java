public class VariableDemo3
{
	public static void main(String ar[])
	{
		byte x = 10;
		int y = x; // implicit casting
		
		System.out.println(x);
		System.out.println(y);
		
		
		int p = 122;
		byte q = (byte) p; // explicit casting
		
		System.out.println(x);
		System.out.println(y);
	}
}