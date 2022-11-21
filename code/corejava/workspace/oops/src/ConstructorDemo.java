public class ConstructorDemo {
	public static void main(String[] args) {
		ProductDetails p1 = new ProductDetails();
		p1.printProductDetails();
		
		System.out.println("==============");
		ProductDetails p2 = new ProductDetails("Smart TV", "Andriod OS based", 44000);
		p2.printProductDetails();
		
		System.out.println("==============");
		ProductDetails p3 = new ProductDetails("Smart Phone", 20000);
		p3.printProductDetails();
	}
}

class ProductDetails {
	String title;
	String desc;
	double price;
	boolean isAvailable;
	
	public ProductDetails() { // no-parameterized constructor 
		title = "NA";
		desc = "NA";
	}
	
	public ProductDetails(String name, double p) { // 2-parameterized Constructor
		this(name, "NA", p); // calling one constructor from another constructor
	}
	
	public ProductDetails(String name, String ds, double p) { // 3-parameterized Constructor
		title = name;
		desc = ds;
		price = p;
		isAvailable = true;
	}
	
	public void printProductDetails() {
		System.out.println("Name : " + title);
		System.out.println("Description : " + desc);
		System.out.println("Price : " + price);
		System.out.println("Is Available : " + isAvailable);
		
	}
}
