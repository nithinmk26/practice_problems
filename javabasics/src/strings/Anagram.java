package strings;

import java.util.Scanner;

public class Anagram {
	
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		System.out.println("Enter the String 1");
		String name1 = scanner.next();
		scanner.nextLine();
		System.out.println(" Enter String 2");
		String name2 = scanner.next();
		scanner.nextLine();
		
		name1 = name1.toLowerCase();
		name2 = name2.toLowerCase();
		
		if(name1.length() != name2.length()) {
			System.out.println(" Strings are not ANAGRAM");
		}
		
	}

}
