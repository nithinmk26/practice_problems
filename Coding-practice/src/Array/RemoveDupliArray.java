package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDupliArray {
	
	public static void removeDupIntArray(int[] arr) {
		int length=arr.length;
		int temp[] = new int[length];
		int j=0;
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j++]=arr[i];
			}
		}
		temp[j++]=arr[length-1];
		System.out.println("Using Temp array");
		for (int i = 0; i < j; i++) {
			System.out.print(temp[i]+" ");
		}
	}
	
	public static void removeDupIntArrayWithoutTemp(int arr[]) {
		
		int length = arr.length;
		int j=0;
		for (int i = 0; i < length-1; i++) {
			if(arr[i]!=arr[i+1]) {
				arr[j++]=arr[i];
			}
		}
		arr[j++]=arr[length-1];
		for (int i = 0; i < j; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		int arr[] = new int[] {2,2,4,4,5,25,25,45,45,96};
		removeDupIntArray(arr);
		System.out.println("Without Temp array ");
		removeDupIntArrayWithoutTemp(arr);
		
		List<Integer> listInt = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			listInt.add(arr[i]);
		}
		System.err.println("Using lambda...!!");
		listInt.stream().distinct().forEach(System.out::println);
		
		System.err.println("Streams-------!");
//		Arrays.asList(arr).stream().forEach(System.out::println);
		Arrays.stream(arr).distinct().forEach(System.out::println);
	}

}
