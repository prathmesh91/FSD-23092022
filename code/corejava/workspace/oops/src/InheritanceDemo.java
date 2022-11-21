
public class InheritanceDemo {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setId(121);
		emp.setName("Abc"); // inherited method
		emp.setPhoneNo("75675687568"); // inherited method
		
		System.out.println("Id : " + emp.getId());
		System.out.println("Name : " + emp.getName()); // inherited method 
		System.out.println("Phone : " + emp.getPhoneNo()); // inherited method
	}
}

class Person {
	private String name;
	private String phoneNo;
	public void setName(String n) {
		name = n;
	}
	public void setPhoneNo(String p) {
		phoneNo = p;
	}
	public String getName() {
		return name;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
}
// Employee IS-A Person
class Employee extends Person {  // Single Inheritance (Parent class is 'Person' and child class is 'Employee')  
	private int id;
	public void setId(int i) {
		id = i;
	}
	public int getId() {
		return id;
	}
}