package interfaceandimplements;

import java.util.Scanner;

interface Shape {
	void acceptInput();
	void calculateArea();
	void displayArea();
}

class Circle implements Shape {
	float radius;
	float area;
	
	public void acceptInput() {
		System.out.print("Enter the radius of circle : ");
		Scanner input = new Scanner(System.in);
		radius = input.nextFloat();
	}
	
	public void calculateArea() {
		area = 3.142f * radius * radius;
	}
	
	public void displayArea() {
		System.out.println("Area of circle : " + area);
	}
	
	
}

class Square implements Shape {
	float side;
	float area;
	
	public void acceptInput() {
		System.out.println("Enter the side of square : ");
		Scanner input = new Scanner(System.in);
		side = input.nextFloat();
	}
	
	public void calculateArea() {
		area = side * side;
	}
	
	public void displayArea() {
		System.out.println("Area of square : " + area);
	}
	
	
}

class Rectangle implements Shape {
	float length,breadth;
	float area;
	
	public void acceptInput() {
		System.out.println("Enter the length and breadth of rectangle : ");
		Scanner input = new Scanner(System.in);
		length = input.nextFloat();
		breadth = input.nextFloat();
	}
	
	public void calculateArea() {
		area = breadth * length;
	}
	
	public void displayArea() {
		System.out.println("Area of rectangle : " + area);
	}
	
	
}
//alternate
class Calculation {
	static void permit(Shape c) {
		c.acceptInput();
		c.calculateArea();
		c.displayArea();
	}
}

public class AreaOfDifferentShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		c.acceptInput();
		c.calculateArea();
		c.displayArea();
		
		Square s = new Square();
		s.acceptInput();
		s.calculateArea();
		s.displayArea();
		
		Rectangle r = new Rectangle();
		r.acceptInput();
		r.calculateArea();
		r.displayArea();
		
		//alternate
		Calculation.permit(new Circle());
		Calculation.permit(new Square());
		Calculation.permit(new Rectangle());

	}

}
