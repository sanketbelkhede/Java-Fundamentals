package innerclassesconcepts;

import static java.lang.Math.*;

class Outer2 {
	static void show() {
	//	static class Inner { local inner classes cannot be static 
		class Inner {
			void display() {
				System.out.println("inner, inside static method");
			}
		}
		Inner inner = new Inner();
		inner.display();
	}
}

public class InnerInsideMethodStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sqrt(25));
		Outer2.show();
	}

}
