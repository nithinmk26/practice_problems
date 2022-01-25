package basics;

import java.util.Scanner;

public class PrimeNumber {
	
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println(" Enter Number to check Prime nUmber :");
	int number = scanner.nextInt();
	if(number == 0 || number == 1)
		System.out.println(number+ "is not prime");
	else
		findPrimeNum(number);
}

private static void findPrimeNum(int number) {
	boolean isPrime = false; 
	for (int i = 2; i < number; i++) {
		if(number%2==0) {
			isPrime = true;
		}
	}
	if(isPrime) {
		System.out.println(number +" is Not Prime");
	}
	else
		System.out.println(number+ " is  Prime");
}
}
