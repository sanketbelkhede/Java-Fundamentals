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

public class GradingSystem {
	
	char grade(float marks) {
		if (marks>90) {
			return 'A';
		} else if (marks>=75 && marks<=89) {
			return 'B';
		} else if (marks>=60 && marks<=74) {
			return 'C';
		} else if (marks>=40 && marks<=59) {
			return 'D';
		}
		return 'F';
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of students : ");
		int a = input.nextInt();
		int [] marks = new int[a];
		String [] name = new String[a];
		int [] M1 = new int[a];
		int [] M2 = new int[a];
		int [] M3 = new int[a];
		int [] sum = new int[a];
		char [] grade = new char[a];
		float avg [] = new float[a];
		GradingSystem gd = new GradingSystem();
		for(int i=0;i<a;i++) {
			System.out.print("Enter name of " + (i+1) + " student : ");
			name[i] = input.next();
			System.out.print("Enter marks of 1st subject");
			M1[i] = input.nextInt();
			System.out.print("Enter marks of 2nd subject");
			M2[i] = input.nextInt();
			System.out.print("Enter marks of 3rd subject");
			M3[i] = input.nextInt();
			avg[i] = (M1[i] + M2[i] + M3[i])/3;
			sum[i] = M1[i] + M2[i] + M3[i];
			grade[i] = gd.grade(avg[i]);
			
		}
		
		
		for(int i=0; i<a; i++) {
			System.out.print(name[i] + " " + sum[i] + " " + grade[i] );
			System.out.println();
		}
	}

}
