package vararguments;

class Demo {
	void add(int ...n) {
		int sum = 0;
		for(int i:n) {
			sum += i;
		}
		System.out.println(sum);
	}
}

public class AdditionbyVarArguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d = new Demo();
		d.add(20,29,30);
	}

}
