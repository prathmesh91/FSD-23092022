public class CustomeThreadDemo {
	public static void main(String[] args) {
		System.out.println("Main Thread : Started");
		CustomThread ct = new CustomThread(); // New Stage
		ct.start(); // Runnable Stage
		System.out.println("Main Thread : Ends");
	}
}

class CustomThread extends Thread {
	public void run() { // Running Stage
		System.out.println("Custom Thread : Started");
		System.out.println(Thread.currentThread());
		System.out.println("Custom Thread : Ends");
	}
}