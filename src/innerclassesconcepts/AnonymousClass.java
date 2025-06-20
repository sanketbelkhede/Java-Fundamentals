package innerclassesconcepts;

class ShoppingCart {
	private double totalAmount;
	ShoppingCart(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public void processPayment(Payment payment) {
		payment.pay(totalAmount);
	}
	
	
}

interface Payment {
	public void pay(double totalAmount);
}

public class AnonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShoppingCart cart = new ShoppingCart(200);
		cart.processPayment(new Payment(){
				@Override
				public void pay(double totalAmount) {
					System.out.println("Paid " + totalAmount + " using credit card");
				}
		});
		
		cart.processPayment(new Payment() {
			@Override
			public void pay(double totalAmount) {
				System.out.println("Paid " + totalAmount + " using UPI");
			}
		});

	}

}
