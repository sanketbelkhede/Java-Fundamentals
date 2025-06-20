package OOPsConcepts;

// Accessing private data members only through member functions.


class Bank {
	private int balance;
	
	void setBalance(int balance) {
		this.balance = balance;
	}
	
	int getBalance() {
		return this.balance;
	}
	
	// Constructor only being used to initialize the data members
	Bank(int balance) {
		this.balance = balance;
	}
}
public class EncapsulationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b1 = new Bank(100000);
		b1.setBalance(10000);
		System.out.println(b1.getBalance());

	}

}
