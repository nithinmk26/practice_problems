package Strings;

import java.util.Scanner;

public class OccuranceReplace {
	
	//Not Completed

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String ---");
		String str = sc.nextLine();
		System.out.println("Enter a Character -- ");
		char ch = sc.next().charAt(0);
		
		String temString = str;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==ch) {
				temString.replace(str.charAt(i), '*');
			}
		}
		System.out.println(temString);
		
}
	
}
