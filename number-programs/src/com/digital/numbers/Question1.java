package com.digital.numbers;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Question1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		if (hasZeroSumSubarray(arr)) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
	}
	 public static Boolean hasZeroSumSubarray(int[] A)
	    {
	        Set<Integer> set = new HashSet<>();
	        set.add(0);
	        int sum = 0;
	        for (int value: A)
	        {
	            sum += value;
	            if (set.contains(sum)) {
	                return true;
	            }
	            set.add(sum);
	        }
	        return false;
	    }
 


}
