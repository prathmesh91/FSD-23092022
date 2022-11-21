
public class InheritnaceByInterface {
	public static void main(String[] args) {
	
	}
}

interface Inter1 {
	public void m1();
}

interface Inter2 {
	void m2();
}
// multiple inheritance using interface.
interface Inter3 extends Inter1, Inter2 {
	void m3();
}
//multiple inheritance using interface.
abstract class Demo implements Inter1, Inter2 {
	
}
//multiple inheritance using interface.
abstract class Test extends Demo implements Inter1, Inter2, Inter3 {
	
}