package Strings;

import java.util.Scanner;

public class NameToUpperCase {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
//		scanner.nextLine();
//		
		name = nameToUpperCase(name);
		System.out.println(name);
		
	}

	public static String nameToUpperCase(String name) {
		
		StringBuilder convertedString = new StringBuilder();
		char upChar = ' ';
		for(int i=0;i<name.length();i++)
		{
			 if(name.charAt(i)>='a'&& name.charAt(i)<='z') {
				upChar = (char) (name.charAt(i) - 32);
			}
			 else {
				 upChar = name.charAt(i);
			 }
			convertedString.append(upChar);
		}
		
		return convertedString.toString();
	}
	
}
