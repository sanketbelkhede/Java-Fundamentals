package stringintro;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the statement.");
		String st = input.nextLine();
		String st1 = "";
		for(int i=st.length()-1; i>=0; i--) {
			st1+=st.charAt(i);
		}
		if(st1.equalsIgnoreCase(st)) {
			System.out.println("Palindrome String.");
		}else {
			System.out.println("Not a Palindrome String.");
		}
		
	}

}
