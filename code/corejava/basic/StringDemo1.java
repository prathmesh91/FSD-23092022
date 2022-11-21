public class StringDemo1
{
	public static void main(String ar[])
	{
		String str1 = new String("Hello");	
		String str2 = "Hello";
		String str3 = "Hello";
		String str4 = new String("Hello");	
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);

		System.out.println(str1 == str2); // false
		System.out.println(str2 == str3); // true
		System.out.println(str1 == str4); // false


		System.out.println(str1.equals(str2)); // true
		System.out.println(str2.equals(str3)); // true
		System.out.println(str1.equals(str4)); // true

	}
}