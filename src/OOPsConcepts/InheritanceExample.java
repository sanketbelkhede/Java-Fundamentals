package OOPsConcepts;

class Father {
	private int a = 10;
	int b = 20;
}

class Child extends Father { // extends is used to inherit
	void display() {
//		System.out.println(a);// Private members are not inherited
		
//		Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//			The field Father.a is not visible
//
//			at OOPsConcepts.Child.display(InheritanceExample.java:10)
//			at OOPsConcepts.InheritanceExample.main(InheritanceExample.java:20)
		System.out.println(b);
	}
}

public class InheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c1 = new Child();
		c1.display();
		System.out.println(c1.b);

	}

}
