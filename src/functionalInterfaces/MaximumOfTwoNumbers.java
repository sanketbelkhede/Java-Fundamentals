package functionalInterfaces;

import java.util.function.BiFunction;

public class MaximumOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction <Double,Double,Double> bf = (a,b)->a>b?a:b; 
		System.out.println(bf.apply(10d, 20d));

	}

}
