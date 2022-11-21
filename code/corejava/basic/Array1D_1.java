public class Array1D_1
{
	public static void main(String arr[])
	{
		int ar[] = {34,54,65,87,8,32,454,43,57,79,79,54,46,87,79,54};
		System.out.println(ar.length);
		System.out.println(ar.length - 1);

		System.out.println("======using for=======");
		for(int i = 0 ; i<ar.length ; i++) {
			System.out.println(ar[i]);
		}
	
		System.out.println("======using for-each=======");
		for(int val : ar) {
			System.out.println(val);
		}
	}
}