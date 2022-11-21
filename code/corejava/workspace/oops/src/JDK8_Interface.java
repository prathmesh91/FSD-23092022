public class JDK8_Interface {
	public static void main(String[] args) {
		InterDemo.m3();
	}
}

@FunctionalInterface
interface InterDemo {
	public void m1(); // abstract method
	public default void m2() { // default method of interface 
		System.out.println("This is the implemented method in interface");
	}
	public static void m3() { // static method in interface
		System.out.println("This is the static method in interface");
	}
	public static void main(String[] args) {
		System.out.println("Interface Demo main method..");
	}
}
