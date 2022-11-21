public class ThisKeywordDemo {
	public static void main(String[] args) {
		UserDetails details = new UserDetails(1, "Abc" , "acb@gmail.com");
		details.square(20);
	}
}

class UserDetails {
	int id;
	String name;
	String email;
	
	public UserDetails(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	public UserDetails(int id, String name, String email) {
		this(name, email); // access the constructor of same class 
		this.id = id; // access the variable of the same class.
		this.square(20); // access the method of same class.
	}
	
	int a = 10;
	public void square(int a) { // shadowing of Variable
		System.out.println("Square : "+ this.a*this.a);
		System.out.println("Square : "+ a*a);
	}
	
}
