package functionalInterfaces;

import java.util.function.BiFunction;

public class ConcateTwoStringsIntoOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction <String, String,String> bf = (str1,str2)->str1+str2;
		System.out.println(bf.apply("Hello", "Java"));

	}

}
