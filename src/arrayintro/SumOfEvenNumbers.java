package arrayintro;

public class SumOfEvenNumbers {

	public static void main(String[] args) {
		int [] age = {10,99,44,54,55,56,83,73,22,23};
		int sum = 0;
		for (int i:age) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}

}
