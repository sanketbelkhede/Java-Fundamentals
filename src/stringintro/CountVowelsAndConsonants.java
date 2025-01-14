package stringintro;

import java.util.Scanner;

public class CountVowelsAndConsonants {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the statement.");
		String st = input.nextLine();
		int vowelCount = 0;
		int consonantCount = 0;
		for(int i=0; i<st.length(); i++) {
			switch(st.charAt(i)) {
			case 'a','e','i','o','u', 'A', 'E', 'I', 'O', 'U':
				vowelCount++;
				break;
//			case 'B','C','':
			default:
				consonantCount++;
				break;
			}
			
		}
		System.out.println("Vowels : " + vowelCount);
		System.out.println("Consonants : " + consonantCount);
	}

}
