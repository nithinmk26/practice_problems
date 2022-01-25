package arrays;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		int arr[] = new int[]{1,3,4,10,98};
		int []replica = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			replica[i] = arr[i];
		}
		System.out.println("Array From Replica..");
		for (int i : replica) {
			System.out.println(i);
		}
	}
}
