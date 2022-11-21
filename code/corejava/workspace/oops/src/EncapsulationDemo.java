public class EncapsulationDemo {
	public static void main(String[] args) {
		Product p1 = new Product();
		
		//p1.title = "Smart TV";
		p1.setTitle("Smart TV");
		p1.setPrice(34535.34);
		p1.setQuantity(1);
				
		System.out.println("Title : " + p1.getTitle());	
		System.out.println("Price : " + p1.getPrice());
		System.out.println("Quantity : " + p1.getQuantity());
	}
}

// Encapsulated class, Plain Old Java Object (POJO), Bean, Entity, Data Transfer Object (DTO)
class Product {
	private String title;
	private double price;
	private int quantity;
	
	public void setTitle(String t) {
		title = t;
	}
	public String getTitle() {
		return title;
	}
	
	public void setPrice(double p) {
		price = p;
	}	
	public double getPrice() {
		return price;
	}
	
	public void setQuantity(int q) {
		quantity = q;
	}
	public int getQuantity() {
		return quantity;
	}
}
