package stringintro;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the statement.");
		String st = input.nextLine();
		String st1 = "";
		for(int i=st.length()-1; i>=0;i--) {
			st1+=st.charAt(i);
		}
		System.out.println(st1);
	}

}
