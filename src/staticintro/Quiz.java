package staticintro;

public class Quiz {
	
	static int ab=100;
	static int bc=200;

	static {
		ab+=1;
		bc+=1;
	}
	
	public static void main(String[] args) {
		ab+=5;
		bc+=10;
		System.out.println(ab + " "+bc);
	}

	static {
		ab+=100;
		bc+=200;
	}


}
