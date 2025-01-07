package arrayintro;

import java.util.Scanner;

public class ArrayPractise {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] age = new int[10];
		for (int i=0; i<10; i++) {
			System.out.println("Enter age of " + (i+1) + "th student: ");
			age[i] = input.nextInt();
		}
		
		for (int i=0; i<10; i++) {
			System.out.print(age[i] + " ");
		}
		
	}

}
