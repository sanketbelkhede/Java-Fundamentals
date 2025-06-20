package functionalInterfaces;

import java.util.function.Function;

public class FunctionInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function <Integer,Integer> s = (n)->n*n;
		s.apply(20);
		System.out.println(s.apply(30));
	}

}
