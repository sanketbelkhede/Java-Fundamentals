package Encapsulation;

class Student {
	private int id;
	private String name;
	private long contact;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCContact(long contact) {
		this.contact = contact;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public long getCContact() {
		return this.contact;
	}
}

public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.setId(12);
		s1.setName("Shruti");
		s1.setCContact(8607975662l);
		System.out.println(s1.getId());
		System.out.println(s1.getName());
		System.out.println(s1.getCContact());

	}

}
