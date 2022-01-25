package arrays;

public class LargestElement {
public static void main(String[] args) {
	int arr[] = new int[] {1,2,3,4,4,5,6,6,7,8,67,435,435,435,8}; 
	int largest = arr[0]; 
	for (int i = 1; i < arr.length; i++) {
		if(largest<arr[i]) { 
			largest = arr[i]; 
		}
	}
	System.out.println("Largest Element in an array - "+largest);
	
	int secondLargest = secondLargest(arr);
	System.out.println("Largest Element in an array - "+secondLargest);
}

private static int secondLargest(int[] arr) {
	for (int i = 0; i < arr.length; i++) {
		for (int j = i+1; j < arr.length; j++) {
			if(arr[i]>arr[j]) { 
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
	int j,k=0;
	int dup[] = new int[arr.length];
	for (int i = 0; i < arr.length; i++) {
        for (j = 0; j <= i; j++) {
            if (arr[i] == arr[j]) {
                break;                                 
            }
        }
        if (i == j) {
            dup[k] = arr[i];
            k++;
        }
    }
	return dup[3];
}

	



}
