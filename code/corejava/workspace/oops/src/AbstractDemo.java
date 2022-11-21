public class AbstractDemo {
	public static void main(String[] args) {
		Audi_A8EV audiCar = new Audi_A8EV();
		Fortuner fortuner = new Fortuner();
		
		carDekhoDotCom(audiCar);
	}
	
	public static void carDekhoDotCom(Car car) {
		car.company();
		car.fualType();
		car.engineDetails();
		car.noOfWheel();
	}
}

abstract class Car {
	public Car() {
		System.out.println("THis is the Car Abstarct Class Constructor");
	}
	public abstract void company();
	public abstract void fualType();
	public abstract void engineDetails();
	public void noOfWheel() {
		System.out.println("4 Wheels With 1 Spair Wheel");
	}
}
abstract class Audi extends Car {
	public void company() {
		System.out.println("Company Name : Audi");
	}
}
class Audi_A8EV extends Audi {
	public void fualType() {
		System.out.println("Fual Type : Electric");
	}
	public void engineDetails() {
		System.out.println("Audi A8EV Engine Details......");
	}
}

abstract class Toyota extends Car {
	public void company() {
		System.out.println("Company Name : Toyota");
	}
}

class Fortuner extends Toyota {
	@Override
	public void fualType() {
		System.out.println("Fual Type : Diesel");
	}

	@Override
	public void engineDetails() {
		System.out.println("Toyota Fortuner Engine Details......");
	}
	
}







