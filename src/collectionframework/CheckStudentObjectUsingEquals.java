package collectionframework;

import java.util.ArrayList;

//class CheckStudentEquals implements Equals

class StudentEquals {
	private int id;
	private String name;
	private int age;
	public StudentEquals(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return id + " " + name + " " + age;
	}
	@Override
	public boolean equals(Object o) {
		StudentEquals other = (StudentEquals)o;
		return (name.equals(other.getName()) && age == other.getAge() && id == other.getId());
	}
}

public class CheckStudentObjectUsingEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<StudentEquals> ts1 = new <StudentEquals>ArrayList();
		ts1.add(new StudentEquals(101,"Sanket", 20));
		ts1.add(new StudentEquals(102,"Ankit", 21));
		ts1.add(new StudentEquals(103,"Paulo", 22));
		
		ArrayList<StudentEquals> ts2 = new <StudentEquals>ArrayList();
		ts2.add(new StudentEquals(101,"Sanket", 20));
		ts2.add(new StudentEquals(102,"Ankit", 21));
		ts2.add(new StudentEquals(103,"Paulo", 22));
		
		System.out.println(ts1);
		System.out.println(ts2);
		System.out.println(ts1.equals(ts2));
	}

}
