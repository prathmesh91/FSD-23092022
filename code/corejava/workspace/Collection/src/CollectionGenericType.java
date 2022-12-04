import java.util.ArrayList;

public class CollectionGenericType {
	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<Double>();
		list.add(78.56);
		list.add(65.16);
		list.add(87.33);
		list.add(78.90);
		list.add(91.55);
		list.add(78.56);
		
		Product p1 = new Product(1, "SmartPhone", 10000);
		Product p2 = new Product(2, "BluetoothSpeaker", 900);
		Product p3 = new Product(3, "Pendrive", 500);
		Product p4 = new Product(4, "SmartWatch", 12000);
		
		ArrayList<Product> productList = new ArrayList<Product>();	
			productList.add(p1);
			productList.add(p2);
			productList.add(p3);
			productList.add(p4);
			
		for(Product p : productList) {
			System.out.print(p.id + "\t");
			System.out.print(p.name + "\t\t");
			System.out.print(p.price + "\n");
		}
	}
}


class Product {
	int id;
	String name;
	double price;
	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}


