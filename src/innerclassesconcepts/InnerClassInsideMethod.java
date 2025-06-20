package innerclassesconcepts;

class Outer1 {
	void show() {
		class Inner {
			void display() {
				System.out.println("inner, inside method");
			}
		}
		Inner inner = new Inner();
		inner.display();
	}
}

public class InnerClassInsideMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer1 outer = new Outer1();
		outer.show();

	}

}
