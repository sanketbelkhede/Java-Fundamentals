package arrayintro;

public class SumAtEvenIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] age = {10,99,44,54,55,56,83,73,22,23};
		int sum = 0;
		for (int i=0; i<age.length; i++) {
			if(i%2==0) {
				sum+=age[i];
			}
		}
		System.out.println(sum);

	}

}
