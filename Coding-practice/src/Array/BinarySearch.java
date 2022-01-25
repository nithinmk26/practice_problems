package Array;

import java.util.Arrays;

public class BinarySearch {
	public static int binarySearch(int []a, int first,int last,int key) {
		int mid = (first+last) / 2;
		while(first<=last) {
		if(a[mid]==key) {
			return mid;
		}
		else if(a[mid]<key) {
			return binarySearch(a, mid+1, last, key);
		}
		else if(a[mid]>key){
			return binarySearch(a, first, mid-1, key);
		}		
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = new int[] {11,54,23,75,232,754,23};
		int array[] = Arrays.stream(arr).sorted().toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		int index = binarySearch(array,0,array.length-1,754);
		if(index==-1) {
			System.out.println("No element Found");
		}
		else {
			System.out.println("Found at index -"+index);
		}
	}

}
