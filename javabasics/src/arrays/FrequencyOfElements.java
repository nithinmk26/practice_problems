package arrays;

public class FrequencyOfElements {
public static void main(String[] args) {
	int arr[] = new int[] {1,2,3,4,5,3,4,1};
	int fr[] = new int[arr.length];
	for (int i = 0; i < arr.length; i++) {
		int count = 1;
		for (int j = i+1; j < fr.length; j++) {
			if(arr[i] == arr[j]) {
				count++;
				fr[j] = -1;
			}
		}
		if(fr[i]!=-1) {
			fr[i] = count;
		}
	}
	
	System.out.println("Array Frequency are ---");
	for (int i = 0; i < fr.length; i++) {
		if(fr[i]!= -1) {
			System.out.print( arr[i] +"-----"+ fr[i]);
			System.out.println();
			}
	}
}
}
