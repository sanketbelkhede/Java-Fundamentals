package interfaceandimplements;
import java.util.Scanner;
interface Calculator{
	int y=50; // static and final
	void acceptInput(); // public and abstract
	void calculation();
	void displayResult();
}

class Add implements Calculator{
	int a,b,c;
	public void acceptInput(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a and b : ");
		 a=scan.nextInt();
		 b=scan.nextInt();		
	}
	public void calculation() {
		c=a+b;
	}
	public void displayResult() {
		System.out.println(c);
		System.out.println(y);
	}
}
public class CalculatorInterface {	
	public static void main(String[] args){
			Add add= new Add();
			add.acceptInput();
			add.calculation();
			add.displayResult();			
	}	
}
