package innerclassesconcepts;

class Outer { // outer classes cannot be static
	int a=10;
	static int b=20;
	private int c=30;
	
	class Inner {
		void display() {
			System.out.println("Inside inner class " + a + " " + b + " " + c);
		}
	}
}

public class InnerClassesIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.display();

	}

}
