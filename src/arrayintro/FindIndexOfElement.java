package arrayintro;

import java.util.Scanner;

public class FindIndexOfElement {
	
	int SearchElement(int arr [], int search) {
		for (int i=0; i<arr.length; i++) {
			if(search == arr[i]) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] age = {10,99,44,54,55,56,83,73,22,23};
		Scanner input = new Scanner(System.in);
		System.out.print("Enter element to find : ");
		int search = input.nextInt();
		
		FindIndexOfElement fd = new FindIndexOfElement();
		int result = fd.SearchElement(age, search);
		
//		int result = -1;
//		for (int i=0; i<age.length; i++) {
//			if(search == age[i]) {
//				result = i;
//				break;
//			}
//		}

		
		if(result>-1) {
		System.out.println("Your element is present at index " + result);
		}else {
			System.out.println("Not Found.");
		}

	}

}
