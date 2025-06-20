package collectionframework;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
	private String name;
	private int rollNo;
	private int age;
	
	
	Student(String name, int rollNo, int age) {
		this.name = name;
		this.rollNo = rollNo;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return name + " " + rollNo + " " + age;
	}
	
	
}

class TasksToPerform {
	ArrayList <Student>listOfStudents = new <Student>ArrayList();
	TasksToPerform() {
		listOfStudents.add(new Student("John", 1, 26));
		listOfStudents.add(new Student("Jonas", 2, 27));
		listOfStudents.add(new Student("Mikkel", 1, 26));
	}
	
	
	
	void displayList() {
		System.out.println(listOfStudents);
	}
	
	void addStudent(String name) {
//		listOfStudents.add(name);
		System.out.println(listOfStudents);
	}
	
	void studentPresent(ArrayList listOfStudents, String name) {
		if(listOfStudents.contains(name)) {
			System.out.println(name + " is present");
		}else {
			System.out.println(name + " is not present");
		}
		
	}
	
	void removeStudent(String name) {
		for(int i=0; i<listOfStudents.size(); i++) {
			if(listOfStudents.get(i).getName().equals(name)) {
				listOfStudents.remove(listOfStudents.get(i));
				System.out.println(name + " has been removed");
				break;
			}else {
				System.out.println(name + " is not present");
			}
		}
	}
}

public class StudentObjectInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
//		listOfStudents.add(new Student("John", 1, 26));
//		listOfStudents.add(new Student("Jonas", 2, 27));
//		listOfStudents.add(new Student("Mikkel", 1, 26));
		TasksToPerform t1 = new TasksToPerform();
		boolean flag = true;
		while(flag) {
			System.out.println("1. Display Student List");
			System.out.println("2. Add a Student");
			System.out.println("3. Check whether student is present.");
			System.out.println("4. Delete a student.");
			System.out.println("0. To exit");
			System.out.println("Enter the task to perform");
			int taskNumber = input.nextInt();
			switch(taskNumber) {
			case 1: 
				t1.displayList();
				break;
//			case 2:
//				System.out.print("Enter student name to add: ");
//				String nameToAdd = input.next();
//				t1.addStudent(nameToAdd);
//				break;
//			case 3:
//				System.out.print("Enter student name to check: ");
//				String nameToCheck = input.next();
//				t1.studentPresent(nameToCheck);
//				break;
			case 4:
				System.out.print("Enter student name to remove: ");
				String nameToRemove = input.next();
				t1.removeStudent(nameToRemove);
				break;
			case 0:
				flag = false;
				break;
			default:
				System.out.println("Wrong Input");
			}
		}
		

	}

}
