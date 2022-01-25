package basics;

import java.util.Scanner;

public class Fibonacci {
	static int a = 1;
	static int b = 2;
	
	
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	System.out.println(" Enter the Number :");
	int number = scanner.nextInt();
	System.out.println(" Fibonnaci Numbers are : ");
	System.out.println(a);
	System.out.println(b);
	findFibonacci(number);
	
}

public static void findFibonacci(int nubmber){
	for (int i = 0; i < nubmber; i++) {
		int c = a+b;
		System.out.println(c);
		a = b; 
		b = c;
	}
	
}
}
