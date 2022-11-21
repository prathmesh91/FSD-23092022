
public class StaticKeywordDemo {
	public static void main(String[] args) {
		System.out.println(StaticDemo.a); // Access Without Object
		StaticDemo.m();
		
		StaticDemo demo = new StaticDemo();
		demo.m1();
	}
}

class StaticDemo
{
	static int a; // static variable
	
	static {  // Static block
		System.out.println("This is from static block");
		a = 10;
	}
	
	int b = 20;
	public static void m() { // static method
		int x = 100;
		System.out.println("Static method m()");
		System.out.println(a);
	}
	public void m1() {
		System.out.println("non-Static method m1()");
	}
}

class Outer {
	
	static class Inner { // static inner class
		
	}
	
}







