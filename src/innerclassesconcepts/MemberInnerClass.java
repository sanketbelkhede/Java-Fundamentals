package innerclassesconcepts;

class Car {
	private String model;
	private boolean isEngineOn;
	
	Car(String model) {
		this.model = model;
		this.isEngineOn = false;
	}
	
	void setModel(String model) {
		this.model = model;
	}
	
	String getModel() {
		return model;
	}
	
	class Engine {
		void start() {
			if(!isEngineOn) {
				isEngineOn = true;
				System.out.println(model + " engine started");
			}else {
				System.out.println(model + " engine already on");
			}
		}
		
		void stop() {
			if(isEngineOn) {
				isEngineOn = false;
				System.out.println(model + " engine stopped");
			}else {
				System.out.println(model + " engine already off");
			}
		}
	}
}

public class MemberInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car("Phantom");
		Car.Engine engine = car.new Engine();
		engine.start();
		engine.stop();

	}

}
