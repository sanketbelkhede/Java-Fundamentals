package collectionframework;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.function.UnaryOperator;

public class MethodsInArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Serializable> list01 = new ArrayList<Serializable>();
		list01.add(1);
		System.out.println(list01);
		list01.addFirst("Java");
		ArrayList<Serializable> list02 = new ArrayList<Serializable>();
		list02.add("one");
		list02.add("two");
		list02.addFirst("three");
		list01.addLast(list02);
		System.out.println(list01);
//		list01.remove(new Integer(1));
//		list01.remove(new String("java"));
		int a = list01.indexOf(list02);
		System.out.println(a);
		list01.replaceAll((UnaryOperator<Serializable>) list02);
		System.out.println(list01.containsAll(list02));
		System.out.println(list01);
//		list01.
	}

}
