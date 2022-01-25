package basics;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		do {
		System.out.println(" choose \n1: Palindrome number \n2: Palindrome string \n3: EXIT");
		choice = scanner.nextInt(); 
		switch (choice) {
		case 1:
			System.out.println("Enter Number TO check Palindrome or not");
			int number = scanner.nextInt();
			plaindromeNum(number);
			break;

		case 2:
			System.out.println("enter a String to check palindrome or not");
			String value = scanner.next();
			scanner.nextLine();
			palindromeStr(value);
		}
	}while (choice!=3);
	}

	private static void palindromeStr(String value) {
		String rev = "";
		for (int i = value.length()-1; i >= 0; i--) {
			rev = rev+value.charAt(i);
		}
		if(rev.equalsIgnoreCase(value)) {
			System.out.println(" Palindrome....!");
		}
		else {
			System.out.println(" Not Palindrome");
		}
	}

	private static void plaindromeNum(int number) {
		int rem,sum=0,temp;
		temp = number;
		while(number!=0) {
			rem = number%10;
			sum =  (sum*10)+rem;
			number = number /10;
		}
		if(temp == sum) {
			System.out.println("Palindrome...!!!");
		}
		else
			System.out.println("Not a Palindrome...!");
	}
		

}
