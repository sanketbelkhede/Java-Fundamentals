package arrayintro;

public class SortArrayAscending {
	
	int [] SortArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1;j++) {
				if(arr[j] > arr[j+1]) {
					arr[j] = arr[j] + arr[j+1] - (arr[j+1] = arr[j]);
				}
			}
		}
		
		return arr;
	}
	public static void main(String[] args) {
		int arr [] = {12, 9, 15, 6, 17};
		SortArrayAscending s = new SortArrayAscending();
		int result [] = s.SortArray(arr);
		for(int i=0;i <result.length;i++) {
			System.out.print(result[i] + " ");
		}
	}

}
