package arrayintro;

import java.util.Scanner;

public class ArrayPractise {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// 1D array
		int [] age = new int[10];
		for (int i=0; i<10; i++) {
			System.out.println("Enter age of " + (i+1) + "th student: ");
			age[i] = input.nextInt();
		}
		
		for (int i=0; i<10; i++) {
			System.out.print(age[i] + " ");
		}
		
		// 2D array
		int [][] arr = {{1,2,3}, {8,7,6}, {5,9,2}};
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				
			}
		}
	}

}
