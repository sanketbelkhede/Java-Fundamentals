package collectionframework;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "missisipi";
		HashSet<Character> hs = new <String>HashSet();
		for(int i=0; i<s.length(); i++) {
			hs.add(s.charAt(i));
		}
		System.out.println(hs);
		
		//to maintain order
		LinkedHashSet<Character> lhs = new <String>LinkedHashSet();
		for(int i=0; i<s.length(); i++) {
			lhs.add(s.charAt(i));
		}
		System.out.println(lhs);
		
		StringBuilder s1 = new StringBuilder();
		for(char l:lhs) {
			s1.append(l);
		}
		System.out.println(s1);
	}

}
