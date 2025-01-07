package basicsofclasses;

import java.util.Scanner;

public class Circle {
	double PI = 3.14;
	Scanner input = new Scanner(System.in);
	
	// without return type and without arguments
	public void Area1 () {
		System.out.print("Enter radius : ");
		float r = input.nextFloat();
		double area = PI * r * r;
		System.out.println("Area = " + area);
	}
	
	// with return type and without arguments
	public double Area2 () {
		System.out.print("Enter radius : ");
		float r = input.nextFloat();
		double area = PI * r * r;
		return area;
	}
	
	// without return type and with arguments
	public void Area3 (float r) {
		double area = PI * r * r;
		System.out.println("Area = " + area);
	}
	
	// with return type and with arguments
	public double Area4 (float r) {
		double area = PI * r * r;
		return area;
	}
}
