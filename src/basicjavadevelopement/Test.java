package basicjavadevelopement;

import basicsofclasses.Car;
import basicsofclasses.Circle;

class Student {
	int id =100;
	String name = "Sanket";
	int age = 25;
	
	void printInfo () {
		System.out.println(id + " " + name + " " + age);
		
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student s1 = new Student();
//		s1.printInfo();
//		
//		Animal a1 = new Animal();
//		a1.printInfo();
//		
//		Car c1 = new Car();
//		c1.carInfo();
//		
		Circle c11 = new Circle();
		c11.Area1();
		
		Circle c12 = new Circle();
		System.out.println(c12.Area2());
		
		Circle c13 = new Circle();
		c13.Area3(5);
		
		Circle c14 = new Circle();
		System.out.println(c14.Area4(5));


	}

}
