package schoolconstuctor;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a number : ");
	int number = input.nextInt();
	boolean flag = true;
	for (int i=2; i < number; i++) {
		if(number % i == 0) {
			flag = false;
			break;
		}
	}
	
	if(flag && number > 1) {
		System.out.println("Prime Number");
	}else {
		System.out.println("Not Prime Number");
	}
	}

}
