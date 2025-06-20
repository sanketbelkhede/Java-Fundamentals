package exceptionhandling;

import java.util.Scanner;

class UnderageException extends Exception {
	@Override
	public String getMessage() {
		return "You are below 18";
	}
}

class OverageException extends Exception {
	@Override
	public String getMessage() {
		return "You are over 60";
	}
}

class Demo {
	void CheckAge(int age) throws OverageException,UnderageException{
		if(age>60) {
			throw new OverageException();
		}else if(age<18) {
			throw new UnderageException();
		}else {
			System.out.println("Welcome");
		}
	}
}

public class RTO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = input.nextInt();
		Demo d1 = new Demo();
		try {
			d1.CheckAge(age);
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}
	}

}
