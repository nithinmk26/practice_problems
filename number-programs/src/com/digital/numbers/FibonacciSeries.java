/**
 * 
 */
package com.digital.numbers;

import java.util.Scanner;

/**
 * @author M1056182
 *
 */
public class FibonacciSeries {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int first = 1;
		int second = 2;
		
		System.out.println("Enter the Last to find the Fib Series..");
		int lastNum = scanner.nextInt();
		
		System.out.println(first);
		System.out.println(second);
		
		for (int i = 2; i <= lastNum; i++) {
			int count = first+second;
			System.out.println(count);
			first = second;
			second = count;
		}
	}

}
