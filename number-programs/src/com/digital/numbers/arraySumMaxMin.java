package com.digital.numbers;

import java.util.Scanner;

public class arraySumMaxMin {
	
	public static int findTotalDistance(int input1, int [] input2) {
		int sum = 0;
		for (int i = 0; i < input2.length-1; i++) {
			int diff = input2[i] - input2[i+1];
			sum+=Math.abs(diff);
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arrSize = scanner.nextInt();
		int input2[]  = new int[arrSize];
		for (int i = 0; i < arrSize; i++) {
			input2[i] = scanner.nextInt();
		}
		System.out.println(findTotalDistance(arrSize,input2));
		
	}

}
