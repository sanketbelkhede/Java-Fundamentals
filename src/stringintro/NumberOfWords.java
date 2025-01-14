package stringintro;

import java.util.Scanner;

public class NumberOfWords {
	
	int WordsCount(String st) {
		int spacecount = 0;
		for(int i=0; i<st.length()-1; i++) {
			if((st.charAt(i) == ' ') && Character.isLetter(st.charAt(i+1)) && (i>0)) {
				spacecount++;
			}
		}
		return ++spacecount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the statement.");
		String st = input.nextLine();
		NumberOfWords obj = new NumberOfWords();
		int result = obj.WordsCount(st);
		
		System.out.println(result);
		System.out.println((st.split(" ")).length);
	}

}
