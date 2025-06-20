package enumintroduction;

enum QuestionLevel {
	low(1),
	medium(2),
	hard(4);
	private int marks;
	QuestionLevel(int marks) {
		this.marks = marks;
	}
}

interface Days {
	String Sunday = "Sunday";
	String Monday = "Monday";
	String Tuesday = "Tuesday";
	String Wednesday = "Wednesday";
	String Thursday = "Thursday";
	String Friday = "Friday";
	String Saturday = "Saturday";
}

class Demo {
	void show() {
		System.out.println("show");
	}
}
class Demo1 extends Demo{
	@Override
	void show() {
		System.out.println("showoverride");
	}
	void display() {
		System.out.println("Display");
	}
}

public class EnumExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(QuestionLevel.values());
//		for(int c: )
		Demo1 d = new Demo1();
		Demo s = d;
		s.show();
//		s.display();// undefined for the type Demo
		
		Demo demo = new Demo1();
		Demo1 demo1 = (Demo1) demo;
		demo1.display();
		demo1.show();

	}

}
