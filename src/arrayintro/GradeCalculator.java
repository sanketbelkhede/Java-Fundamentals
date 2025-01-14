package arrayintro;

import java.util.Scanner;

/*
2. The grading system takes input for multiple students and calculates the grade based on the following criteria:
• A Grade: If the total marks are greater than or equal to 90.
B Grade: If the total marks are between 75 and 89.
C Grade: If the total marks are between 60 and 74.
D Grade: If the total marks are between 40 and 59.
F Grade: If the total marks are less than 40.
You need to:
Store the data for multiple students, such as their name, marks for three subjects, and calculate their total score. Based on the total score, assign a grade.
Display the student name, total score, and grade.
*/
class Student {
	String name;
	int marks1, marks2, marks3;
	float totalMarks, averageMarks;
	char grade;
	
	Student(String name, int marks1, int marks2, int marks3) {
		this.name = name;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
		this.totalMarks = marks1 + marks2 + marks3;
		this.averageMarks = (marks1 + marks2 + marks3)/3;
		gradecalc();
	}
	
	void gradecalc() {
		if (averageMarks>90) {
			grade = 'A';
		} else if (averageMarks>=75 && averageMarks<=89) {
			grade = 'B';
		} else if (averageMarks>=60 && averageMarks<=74) {
			grade = 'C';
		} else if (averageMarks>=40 && averageMarks<=59) {
			grade = 'D';
		} else {
			grade = 'F';
		}
	}
	
	void display() {
		System.out.println(name + " " + totalMarks + " " + grade);
	 }
}

public class GradeCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of students : ");
		int totalStudents = input.nextInt();
		
		Student [] st = new Student[totalStudents];
		
		for(int i=0; i<totalStudents; i++) {
			System.out.print("Enter name of student " + (i+1) + " : ");
			String name = input.next();
			System.out.print("Enter marks in subject 1 : ");
			int marks1 = input.nextInt();
			System.out.print("Enter marks in subject 2 : ");
			int marks2 = input.nextInt();
			System.out.print("Enter marks in subject 3 : ");
			int marks3 = input.nextInt();
			
			st[i] = new Student(name, marks1, marks2, marks3);
		}
		System.out.println();
		System.out.println("---Results Declared---");
		
		for(Student student:st) {
			student.display();
		}
	}

}
