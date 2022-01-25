package arrays;

public class RemoveDuplicates {
public static void main(String[] args) {
	int arr[] = new int[] {1,2,1,3,4,4,5,6,6,7,8,67,435,435,435,8}; 
	int j;
	for (int i = 0; i < arr.length; i++) { 
		for (j = 0; j <=i; j++) { 
			if(arr[i]==arr[j]) { 
				break;
			}
		}
		if(i==j) {
			System.out.println(arr[i]);
		}
	}
}
}
