public class OverridingDemo {
	public static void main(String[] args) {
		Person2 obj = new Developer(); // Polymorphic Object
		obj.intro();
	}
}
class Person2 {
	int intro() {
		System.out.println("Hello, I am a Person..");
		return 0;
	}
}
class Doctor extends Person2 {
	public int intro() {
		System.out.println("Hello, I am a Doctor...");
		return 0;
	}
}
class Developer extends Person2 {
	int intro() {
		System.out.println("Hello, I am a Software Developer...");
		return 1;
	}
}



