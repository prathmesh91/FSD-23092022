public class SynchronizationDemo {
	public static void main(String[] args) {
		Printer p = new Printer();
		Thread1 t1 = new Thread1(p);
		Thread2 t2 = new Thread2(p);
		t1.start();
		t2.start();
	}
}

class Thread1 extends Thread {
	Printer p;
	public Thread1(Printer p) {
		this.p = p;
	}
	public void run() {
		synchronized (p) {
			for (int i = 1; i <= 10; i++) {
				p.print("10 * " + i + " = " + (10 * i));
			}
		}
	}
}

class Thread2 extends Thread {
	Printer p;
	public Thread2(Printer p) {
		this.p = p;
	}
	public void run() {
		synchronized (p) {
			for (int i = 1; i <= 10; i++) {
				p.print("17 * " + i + " = " + (17 * i));
			}
		}
	}
}

class Printer {
	public void print(String val) {
		System.out.println(val);
	}
}
