package collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Tasks {
	ArrayList studentList = new ArrayList();
	Tasks () {
		studentList.add("James");
		studentList.add("Michael");
		studentList.add("Robert");
		studentList.add("William");
		studentList.add("Christopher");
		studentList.add("Matthew");
	}
	void displayList() {
		System.out.println(studentList);
	}
	
	void addStudent(String name) {
		studentList.add(name);
		System.out.println(studentList);
	}
	
	void studentPresent(String name) {
		if(studentList.contains(name)) {
			System.out.println(name + " is present");
		}else {
			System.out.println(name + " is not present");
		}
		
	}
	
	void removeStudent(String name) {
		if(studentList.contains(name)) {
			studentList.remove(name);
		}else {
			System.out.println(name + " is not present");
		}
	}
}

public class StudentsListTasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = true;
		Scanner input = new Scanner(System.in);
		Tasks t1 = new Tasks();
		System.out.println("-------Welcome------");
		System.out.println("Tasks");
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
			case 2:
				System.out.print("Enter student name to add: ");
				String nameToAdd = input.next();
				t1.addStudent(nameToAdd);
				break;
			case 3:
				System.out.print("Enter student name to check: ");
				String nameToCheck = input.next();
				t1.studentPresent(nameToCheck);
				break;
			case 4:
				System.out.print("Enter student name: ");
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
