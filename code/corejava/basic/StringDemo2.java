public class StringDemo2
{
	public static void main(String ar[])
	{
		String s1 = "Welcome";
		System.out.println(s1);  // Welcome
		String s2 = s1.toUpperCase();
		System.out.println(s2);  // WELCOME
		System.out.println(s1.toLowerCase());
		
		String s3 = " Java Program";
		System.out.println(s1.concat(s3)); // Welcome Java Program
		String s4 = s1 + s3; // Welcome Java Program
		String s5 = s4.replaceAll("Java", "C++");
		System.out.println("s4 : " + s4);
		System.out.println("s5 : " + s5);

		String s6 = "profile-image.jpeg";
		System.out.println("endsWith : " + s6.endsWith(".jpeg"));
		System.out.println("startsWith : " + s6.startsWith("profile"));

		System.out.println("length : " + s1.length());
		System.out.println(s1.charAt(3));
		System.out.println(s1.indexOf('l'));

		char ch[] = s1.toCharArray();
		//emocleW
		for(int i = ch.length-1 ; i>=0 ; i--) {
			System.out.print(ch[i]);
		}
	}
}





