class Parent {
	int a = 10;
	public void m() {
		System.out.println("Hello I am from Parent");
	}
}

class Child extends Parent {
	int a = 20;
	public void print(int a) {
		System.out.println(a);		//30
		System.out.println(this.a);	//20
		System.out.println(super.a);//10 access variable of super class 
		super.m(); // access method of super class
	}
	public void m() {
		System.out.println("Hello I am from Child");
	}
}




public class SuperKeywordDemo {
	public static void main(String[] args) {
		Child c = new Child();
		c.print(30);
		System.out.println("-----------------------");
		Employee1 e = new Employee1(10);
		
	}
}

class Person1 {
	public Person1() {
		super(); // calling super class constructor
		System.out.println("I am a Person");
	}
	public Person1(int id) {
		this();
		System.out.println("Person Id : " + id);
	}
}

class Employee1 extends Person1{
	public Employee1() {
		super(12);
		System.out.println("I am a Employee");
	}
	public Employee1(int id) {
		this();
		System.out.println("Employee Id : " + id);
	}

}


















