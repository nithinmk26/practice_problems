package arrays;

public class DuplicatesPrinting {
public static void main(String[] args) {
	int arr[] = new int[] {1,2,3,4,5};
	int dup[] = new int[arr.length];
	for (int i = 0; i < arr.length; i++) {
		boolean isRepeat = false;
		for (int j = i+1; j < arr.length; j++) {
			if(dup[i] == -1)
				break;
			if(arr[i]==arr[j]) {
				dup[j] = -1;
				isRepeat = true;
			}
		}
		if(isRepeat) {
			dup[i] = arr[i];
		}
	}
	System.out.println("Duplicate Elements are:");
	int count = 0;
	for (int i : dup) {
		if(i!=-1 && i!=0) {
			count++;
			System.out.println(i);
		}
	}
	if(count<1) {
		System.out.println("No Duplicates"+ -1);
	}
}
}
