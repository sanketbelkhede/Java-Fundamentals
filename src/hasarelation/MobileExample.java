package hasarelation;

class OS{
	private int version;
	private String name;
	
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	OS(int version,String name){
		this.version=version;
		this.name=name;
	}
	@Override
	public String toString() {
		return "OS [version=" + version + ", name=" + name + "]";
	}	
}

class Charger{
	
	int voltage;
	String colour;
	
	public int getVoltage() {
		return voltage;
	}
	public void setVoltage(int voltage) {
		this.voltage = voltage;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}	
	Charger(int voltage,String colour){
		this.voltage=voltage;
		this.colour=colour;
	}	
}
class Mobile{	
	OS os;
	
	void hasA(Charger c){		
		System.out.println(c.colour + " "+c.voltage);
	}
	
	Mobile(OS os){
		this.os=os;
	}
}
public class MobileExample {
	
	public static void main(String[] args){
			Mobile m = new Mobile(new OS(15,"IOS"));
			System.out.println(m.os);
			Charger c= new Charger(12,"Black");
			m.hasA(c);			
	}	
}

