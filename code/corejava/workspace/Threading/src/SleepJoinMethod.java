public class SleepJoinMethod {
	public static void main(String[] args) {
		System.out.println("Main thread started....");
		TablePrint print = new TablePrint();
		print.start();
		for(int i =1; i<=10; i++) {
			System.out.println(i);
		}
		
		try {
			print.join(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main thread ends....");
	}
}
class TablePrint extends Thread {
	public void run() {
		System.out.println("Table Print Started....");
		for(int i=1;i<=10;i++) {
			System.out.println("5 * " + i + " = " + (5*i));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Table Print Ends....");
	}
}
