package com.digital.numbers;

import java.util.Scanner;

public class arraySum {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arrSize = 5;
		int input2[]  = new int[] {18,11,27,12,14};
		int sum=0;
		for (int i = 0; i < input2.length; i++) {
			sum+=input2[i]/12;
		}
		System.out.println(sum);
		
	}

}
