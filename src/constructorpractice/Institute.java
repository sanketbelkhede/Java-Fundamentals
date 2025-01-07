package constructorpractice;

class Employee {
	String name;
	int salary;
	int id;

	// non parameterized constructor
	Employee() {
		name = "Sanket";
		salary = 50000;
		id = 429;
	}
	
	// this represent current instance of an object

	// parameterized constructor
	Employee(int salary, int id, String name) {
		this.name = name;
		this.salary = salary;
		this.id = id;
	}
	
	Employee(int id, String name, int salary) {
		this.name = name;
		this.salary = salary;
		this.id = id;
	}

	void display() {
		System.out.println(id + " " + name + " " + salary);
	}
}

public class Institute {

	public static void main(String[] args) {
		Employee e = new Employee();
		Employee e1 = new Employee(30000, 301, "Ramesh");
		Employee e2 = new Employee(35000, 302, "Suresh");
		byte a = 10;
		// type casting come into picture
		Employee e3 = new Employee(a, "Suresh", 32000);
		e.display();
		e1.display();
		e2.display();
		e3.display();
	}

}
