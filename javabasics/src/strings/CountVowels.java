package strings;

import java.util.Scanner;

public class CountVowels {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter the String to find a no of letters..!");
		String name = scanner.next();
		scanner.nextLine();
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			if((name.charAt(i) == 'a')||(name.charAt(i) == 'e')||(name.charAt(i) == 'i')||(name.charAt(i) == 'o')||(name.charAt(i) == 'u'))
			count++;
		}
		System.out.println(" Total Vowels Found - "+count);
	}

}
