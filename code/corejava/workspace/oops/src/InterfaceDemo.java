public class InterfaceDemo {
	public static void main(String[] args) {
		Organization org = new AbcPvtLtd();
		org.attendancePolicies();
		org.leavePolicies();
	}
}

interface Organization {
	String location = "PUNE"; // public static final String location = "PUNE"
	void leavePolicies(); // public abstract void leavePolicies();
	void attendancePolicies(); // public abstract void leavePolicies();
}

abstract class PqrPvtLtd implements Organization {
	
}


class AbcPvtLtd implements Organization {
	public void leavePolicies() {
		System.out.println("Abc.Pvt.Ltd offers 15 days of total leave for employee in an year.");
	}
	public void attendancePolicies() {
		System.out.println("As per attendenc Policy Employee has to spend 40 hrs in a week in the Organization");
	}
}
