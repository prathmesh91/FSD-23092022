public class StringBufferDemo
{
	public static void main(String arr[])
	{
		StringBuffer sbr = new StringBuffer("Hello");
		System.out.println(sbr); // Hello
		sbr.append(" Java ");
		System.out.println(sbr); // Hello Java
		sbr.append(11);
		System.out.println(sbr); // Hello Java 11
		sbr.insert(5, " StringBuffer in");
		System.out.println(sbr); // Hello StringBuffer in Java 11
		sbr.reverse();
		System.out.println(sbr);
	}
}