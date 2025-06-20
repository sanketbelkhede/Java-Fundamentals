package collectionframework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

class StudentInTree implements Comparable<StudentInTree> {
	int rollNo;
	String name;
	int id;
	StudentInTree(int rollNo, String name, int id) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.id = id;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return rollNo + " " + name + " " + id;
	}
	
	@Override
	public int compareTo(StudentInTree st) {
		String i1 = this.name;
		String i2 = st.name;
		return i1.compareTo(i2);
		
	}
	
	
}

public class StudentInTreeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<StudentInTree> ts = new <StudentInTree>TreeSet();
		ts.add(new StudentInTree(101,"Sanket", 18));
		ts.add(new StudentInTree(102,"Ankit", 20));
		System.out.println(ts);
		
		HashMap<Integer,Character> hs = new <Integer,Character>HashMap();
		hs.put(1, '2');
		hs.put(2, '5');
		hs.put(1, '3');
		hs.put(3, '3');
		System.out.println(hs);
		char c = hs.get(3);
		System.out.println(hs.get(1));
		System.out.println(c);
		System.out.println(hs.values());
		HashSet hst = new HashSet();
		hst.addAll(hs.values());
		hst.addAll(hs.values());
		hst.removeAll(hst);
		System.out.println(hst.size());

	}

}
