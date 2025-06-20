package interfaceandimplements;

import java.util.Scanner;

interface Authentication {
	boolean authenticateUser(String userName, String password);
}

interface ProcessPayment {
	void payingMerchant(long amount);
}

class PaymentGateway implements Authentication, ProcessPayment {
	String userName = "sanket";
	String password = "9876543210";

	@Override
	public void payingMerchant(long amount) {
		System.out.println("Payment completed of Rs " + amount);
	}

	@Override
	public boolean authenticateUser(String userName, String password) {
		if(userName.equals(this.userName) && password.equals(this.password)) {
			return true;
		}
		return false;
	}
	
}

public class FakeNetflix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean user;
		String userName, password;
		long amount;
		Scanner input = new Scanner(System.in);
		
		PaymentGateway paymentgateway = new PaymentGateway();
		
		System.out.print("Enter Username : ");
		userName = input.next();
		
		System.out.print("Enter Password : ");
		password = input.next();
		
		user = paymentgateway.authenticateUser(userName, password);
		
		if(user) {
			System.out.print("Enter payemnt amount :");
			amount = input.nextLong();
			paymentgateway.payingMerchant(amount);
		}else {
			System.out.println("Authentication Failed.");
		}
		
		input.close();
	
	}

}
