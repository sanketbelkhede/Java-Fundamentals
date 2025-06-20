package functionalInterfaces;

import java.util.function.Supplier;

public class SupplierInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier s = ()->Math.random();
		System.out.println(s.get());

	}

}
