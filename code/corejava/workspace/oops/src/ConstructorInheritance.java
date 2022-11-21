public class ConstructorInheritance {
	public static void main(String[] args) {
		C3 obj = new C3();
	}
}

class C1 extends Object {
	public C1() {
		super();
		System.out.println("I am C1 Constructor");
	}
}

class C2 extends C1 {
	public C2() {
		super();
		System.out.println("I am C2 Constructor");
	}
}

class C3 extends C2 {
	public C3() {
		super();
		System.out.println("I am C3 Constructor");
	}
}
