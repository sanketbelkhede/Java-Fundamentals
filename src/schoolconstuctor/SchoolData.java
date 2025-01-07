package schoolconstuctor;

class Student {
	int rollno;
	String name;
	
	Student() {
		this.rollno = 1;
		this.name = "A6y";
		display2();
	}
	
	Student(int rollno, String name) {
		this();
	}
	
	Student (String name, int rollno) {
		
	}
	
	void display2 () {
		System.out.println("Hello " + name);
	}
	
	void display () {
		System.out.println(this.rollno + " " + name);
	}
}

public class SchoolData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		Student s2 = new Student(12, "DJKjk");
		s1.display();
		

	}

}
