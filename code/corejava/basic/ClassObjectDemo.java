public class ClassObjectDemo {
	public static void main(String args[]) {
		Product p1;  // reference variable
		p1 = new Product();  // Object of class
		
		p1.id = 20;  // access variable using Object
		p1.qty = 200;

		p1.printDetails(); // access method using Object
	}
}
class Product {
	int id;
	int qty;
	double price;
	public void setDetails(int i, int q, double p){
		id = i;
		qty = q;
		price = p;
	}
	public void printDetails() {
		System.out.println("Id : " + id);
		System.out.println("Quantity : " + qty);
		System.out.println("Price : " + price);
	}
}