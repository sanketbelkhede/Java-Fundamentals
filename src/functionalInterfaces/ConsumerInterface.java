package functionalInterfaces;

import java.util.function.Consumer;

public class ConsumerInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer <String> c = (n)->System.out.println(n.length());
		c.accept("Sanket");
	}

}
