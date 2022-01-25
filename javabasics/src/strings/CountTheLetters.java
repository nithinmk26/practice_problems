package strings;

import java.util.Scanner;

public class CountTheLetters {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println(" Enter the String to find a no of letters..!");
	String name = scanner.next();
	scanner.nextLine();
	int count = 0;
	for (int i = 0; i < name.length(); i++) {
		count++;
	}
	System.out.println(" Total characters Found - "+count);
}
}
