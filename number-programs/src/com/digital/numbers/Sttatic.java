package com.digital.numbers;

import java.util.Scanner;

public class Sttatic {
	


	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double height = scanner.nextDouble();
//		height = height/12;
		double rem = height % 1;
		if(rem>0.50) {
			height = Math.floor(height) + 1;
		}
		else {
			height = Math.floor(height) + 0.5;
		}
		System.out.println(height);
		

	}
	
}
