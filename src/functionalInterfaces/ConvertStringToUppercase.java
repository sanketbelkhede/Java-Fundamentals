package functionalInterfaces;

import java.util.function.Consumer;
import java.util.function.Function;

public class ConvertStringToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer <String> c = (str)->System.out.println(str.toUpperCase());
		c.accept("sanket");
		
		Function <String,String> f = (str)->str.toUpperCase();
		System.out.println(f.apply("sanjay"));

	}

}
