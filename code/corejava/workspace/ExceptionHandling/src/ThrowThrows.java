public class ThrowThrows {
	public static void main(String[] args) {
		VaccenationSlot slot = new VaccenationSlot();
		try {
			slot.allocateSlot(-22);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}


class VaccenationSlot {
	
	public void allocateSlot(int age) throws Exception, RuntimeException {
		if(age>=60 && age<=120) {
			System.out.println("Allocate Slot-1");
		} else if(age>=50 && age<60) {
			System.out.println("Allocate Slot-2");
		} else if(age>=18 && age<50) {
			System.out.println("Allocate Slot-3");
		} else if(age>=4 && age<18) {
			System.out.println("Allocate Slot-4");
		} else {
			throw new Exception("Invalid Age...."); // raise exception manually..
		}
	}
}
