package arrayintro;

import java.util.Scanner;

/*
A Discrete Mathematics professor has a class of students. Frustrated with their lack of discipline, the professor decides to cancel class if fewer than some number of students are present when class starts. Arrival times go from on time () to arrived late ().

Given the arrival time of each student and a threshhold number of attendees, determine if the class is cancelled.
*/
public class AngryProfessor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students : ");
		int num = input.nextInt();
		int a[] = new int[num];
		System.out.print("Enter threshold number : ");
		int threshold = input.nextInt();
		System.out.println("Enter array.");
		for(int i=0; i<num; i++) {
			a[i] = input.nextInt();
		}
		int count = 0;
		for(int i=0; i<num; i++) {
			if(a[i]<=0) {
				count++;
			}
		}
		if(count>=threshold) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
