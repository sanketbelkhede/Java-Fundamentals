package innerclassesconcepts;

class Computer {
	private String brand;
	private String model;
	private OperatingSystem OS;
	Computer(String brand,String model,String osName) {
		this.brand = brand;
		this.model = model;
		this.OS = new OperatingSystem(osName);
	}
	
	String getBrand() {
		return brand;
	}
	String getModel() {
		return model;
	}
	
	OperatingSystem getOS() {
		return OS;
	}
	
	static class USB {
		String type;
		
		USB(String type) {
			this.type = type;
		}
		
		void getType() {
			System.out.println(type); 
		}
	}
	
	class OperatingSystem {
		private String osName;
		
		OperatingSystem(String osName) {
			this.osName = osName;
		}
		
		String getOsName() {
			return osName;
		}
		
		void displayInfo() {
			System.out.println(brand + ", " + model + ", " + osName);
		}
	}
}

public class StaticNestedInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer computer = new Computer("HP","Pavallion","Windows");
		Computer.USB usb1 = new Computer.USB("type C");
		computer.getOS().displayInfo();
		usb1.getType();

	}

}
