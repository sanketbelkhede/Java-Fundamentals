package arrayintro;

import java.util.Scanner;
/*
Given an array of bird sightings where every element represents a bird type id, determine the id of the most frequently sighted type. If more than 1 type has been spotted that maximum amount, return the smallest of their ids.

Example

There are two each of types  and , and one sighting of type . Pick the lower of the two types seen twice: type .
*/
public class MigratoryBirds {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int num = input.nextInt();
		int arr [] = new int[num];
		System.out.println("Enter the array.");
		for(int i=0; i<num; i++) {
			arr[i] = input.nextInt();
		}
		int sightings [] = new int[5];
		
		for(int i=0; i<num; i++) {
			int temp = arr[i];
			sightings[temp-1]++;
		}
		int max = -1;
		int result = -1;
		for(int i=0; i<5; i++) {
			if(sightings[i]>max) {
				max=sightings[i];
				result = i+1;
			}
		}
		System.out.print(result);
	}

}
