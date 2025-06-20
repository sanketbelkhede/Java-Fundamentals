package enumintroduction;

import java.util.Scanner;

enum Pizza {
	small(100),
	medium(200),
	large(300);
	private int price;
	Pizza(int price) {
		this.price = price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	int getPrice() {
		return price;
	}
}

public class PizzaShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalBill = 0;
		Scanner input = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
			System.out.println("1. Enter the size you want to order(small/medium/large): ");
			System.out.println("2. Enter exit if you are done. ");
			String choice = input.next();
			
			switch(choice) {
			case "small", "medium", "large":
				System.out.println("Enter quantity");
				int quantity = input.nextInt();
				totalBill += quantity*Pizza.valueOf(choice).getPrice();
				break;
			case "exit":
				System.out.println("Total amounnt to be paid: " + totalBill);
				flag = false;
				break;
			default:
				System.out.println("Invalid input");
			}
		}
		
		
	}

}
