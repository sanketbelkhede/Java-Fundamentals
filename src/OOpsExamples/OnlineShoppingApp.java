package OOpsExamples;

class Product {	
	String name;
	double price;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	Product(String name, double price){
		this.name=name;
		this.price=price;
	}

}

class Electronics extends Product {
	Electronics(String name, double price) {
		super(name, price);
	}

}

class Clothing extends Product {
	Clothing(String name, double price) {
		super(name, price);
	}
}

class Groceries extends Product {
	Groceries(String name, double price) {
		super(name, price);
	}
}

class Cart {
	double cartAmount;
	
}

public class OnlineShoppingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Electronics e1 = new Electronics("Mobile", 39999);
		

	}

}
