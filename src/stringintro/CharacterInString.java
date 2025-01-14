package stringintro;

import java.util.Scanner;

public class CharacterInString {
	
	int ReturnIndex(String st, char ch) {
		for(int i=0; i<st.length(); i++) {
			if(ch == st.charAt(i)) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the statement.");
		String st = input.nextLine();
		System.out.print("Enter character to find : ");
		char key = input.next().charAt(0);
		CharacterInString obj = new CharacterInString();
		int result = obj.ReturnIndex(st, key);
		
		System.out.println(result);

	}

}
