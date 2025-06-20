package functionalInterfaces;

import java.util.function.Predicate;

public class PredicateInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate <Integer> p = (n)->n%2==0;
		System.out.println(p.test(2));
	}

}
