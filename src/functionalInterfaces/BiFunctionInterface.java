package functionalInterfaces;

import java.util.function.BiFunction;

public class BiFunctionInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction <Integer, Integer, Integer> bf = (a,b)->a+b;
		System.out.println(bf.apply(3, 4));

	}

}
