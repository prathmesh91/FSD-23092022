public class OverloadingDemo {
	public static void main(String[] args) {
		Addition obj = new Addition();
		obj.add(12, 34);
		obj.add("Abc", " Xyz");
		obj.add(234.12, 34.23);
	}
	
	public static void main(int[] args) {
		
	}
}

class Addition {
	public void add(int a, int b) {
		int ans = a + b;
		System.out.println("2 int values Addition : " + ans);
	}
	
	protected void add(int a, int b, double c)  {
		double ans = a + b + c;
		System.out.println("2 int and 1 double values Addition : " + ans);
	}
	
	 void add(double a, int b, int c)  {
		double ans = a + b + c;
		System.out.println("2 int and 1 double values Addition : " + ans);
	}
	
	public void add(double a, double b) {
		double ans = a + b;
		System.out.println("2 double values Addition : " + ans);
	}
	
	public void add(String a, String b) {
		String ans = a + b;
		System.out.println("2 String values Addition : " + ans);
	}
}
