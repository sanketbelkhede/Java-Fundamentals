package arrayintro;

import java.util.Scanner;

/*
 Write a program that stores the marks of the students in an array and calculates
 their average marks. The program should also determine how many students passed(50 above)
 and how many failed.
 */

public class MarksAverage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] arr = {34, 55, 75, 67, 51, 76, 40, 40, 76, 49};
		float avg = 0;
		float sum = 0;
		int failedCount = 0;
		int passedCount = 0;
		for(int i:arr) {
			sum+=i;
			if(i>50) {
				passedCount++;
			}else {
				failedCount++;
			}
		}
		avg = sum/arr.length;
		System.out.println("Passed : " + passedCount);
		System.out.println("Failed : " + failedCount);
		System.out.println("Average : " + avg);
	}

}
