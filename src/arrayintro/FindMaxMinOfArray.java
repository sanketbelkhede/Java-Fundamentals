package arrayintro;

public class FindMaxMinOfArray {
	
	int Minimum(int arr[]) {
		int max = -100000;
		for(int i:arr) {
			if(i > max) {
				max = i;
			}
		}
		return max;
	}
	
	int Maximum(int arr[]) {
		int min = 100000;
		for(int i:arr) {
			if(i < min) {
				min = i;
			}
		}
		return min;
	}

	public static void main(String[] args) {
		int arr [] = {12, 13, 4, 9, 12, 15};
		FindMaxMinOfArray a = new FindMaxMinOfArray();
		int minValue = a.Minimum(arr);
		int maxValue = a.Maximum(arr);
		System.out.println("Minimum : " + minValue);
		System.out.println("Maximum : " + maxValue);
	}

}
