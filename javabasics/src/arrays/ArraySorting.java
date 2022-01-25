package arrays;

public class ArraySorting {

	public static void main(String[] args) {
		int []arr = new int[] {9,8,4,5,2,3,90,88,60,23};
		System.out.println("Without Sorting Array ");
		for (int i : arr) {
			System.out.print(" "+i+" ");
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			int temp=0;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("Sorted Array ");
		for (int i : arr) {
			System.out.print(" "+i+" ");
		}
	}

}
