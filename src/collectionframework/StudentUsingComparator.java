package collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class IdComparator implements Comparator<StudentCamparator> {
	@Override
	public int compare(StudentCamparator s1, StudentCamparator s2) {
		int id1 = s1.getId();
		int id2 = s2.getId();
		return id1-id2;
	}
}

class NameComparator implements Comparator<StudentCamparator> {
	@Override
	public int compare(StudentCamparator s1, StudentCamparator s2) {
		return s1.getName().compareTo(s2.getName());
	}
}

class AgeComparator implements Comparator<StudentCamparator> {
	@Override
	public int compare(StudentCamparator s1, StudentCamparator s2) {
		return s1.getAge() - (s2.getAge());
	}
}

class MarksComparator implements Comparator<StudentCamparator> {
	@Override
	public int compare(StudentCamparator s1, StudentCamparator s2) {
		return s1.getMarks() - (s2.getMarks());
	}
}

class StudentCamparator{
	private int id;
	private String name;
	private int age;
	private int marks;
	public StudentCamparator(int id, String name, int age, int marks) {
//		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
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
	@Override
	public String toString() {
		return id + " " + name + " " + age + " " + marks;
	}
	
}

public class StudentUsingComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<StudentCamparator> ts = new <StudentCamparator>ArrayList();
		ts.add(new StudentCamparator(101,"Sanket", 20, 100));
		ts.add(new StudentCamparator(102,"Ankit", 21, 99));
		ts.add(new StudentCamparator(102,"Paulo", 21, 98));
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number from below list");
		System.out.println("Enter 1 to compare by id.");
		System.out.println("Enter 2 to compare by name.");
		System.out.println("Enter 3 to compare by age.");
		System.out.println("Enter 4 to compare by marks.");
		int choice = input.nextInt();
		switch(choice) {
		case 1 :
			Collections.sort(ts, new IdComparator());
			break;
		case 2 :
			Collections.sort(ts, new NameComparator());
			break;
		case 3 :
			Collections.sort(ts, new AgeComparator());
			break;
		case 4 :
			Collections.sort(ts, new MarksComparator());
			break;
		default:
			System.out.println("Invalid");
		}
		
		System.out.println(ts);
	}

}
