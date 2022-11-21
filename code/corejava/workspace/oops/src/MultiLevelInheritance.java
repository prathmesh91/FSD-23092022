
public class MultiLevelInheritance {
	public static void main(String[] args) {
		C c = new C();
		System.out.println(c.x);
		System.out.println(c.y);
		System.out.println(c.z);
		
		
		
		A a1 = new B(); // Polymorphic Object
		A a2 = new C(); // Polymorphic Object 	
		
	}
}


class A {
	int x = 10;
}

/*class D {
	int x = 15;
}

class E extends A, D {
	public void m() {
		System.out.println(x); // there will be ambiguity (confusion) while access the Variable and hence Multiple and Hybrid inheritance is not allowed.  
	}
}*/

class B extends A {
	int y = 30;
}

class C extends B {
	int z = 40;
}