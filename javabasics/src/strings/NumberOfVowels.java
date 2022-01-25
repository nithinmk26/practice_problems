/**
 * 
 */
package strings;

import java.util.Scanner;

/**
 * @author NandaNithin
 *
 */
public class NumberOfVowels {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter the String ..!");
		String name = scanner.next();
		scanner.nextLine();
		int vowelCount[] = new int[5]; 
		
		for (int i = 0; i < name.length(); i++) {
			if(name.charAt(i)=='a') {
				vowelCount[0] = vowelCount[0] + 1;
			}
			else if(name.charAt(i)=='e') {
				vowelCount[1] = vowelCount[1] + 1;
			}
			else if(name.charAt(i)=='i') {
				vowelCount[2] = vowelCount[2] + 1;
			}
			else if(name.charAt(i)=='o') {
				vowelCount[3] = vowelCount[3] + 1;
			}
			else if(name.charAt(i)=='u') {
				vowelCount[4] = vowelCount[4] + 1;
			}
		}
		
		scanner.close();
		char vowels[] = new char[] {'a','e','i','o','u'};
		for (int i = 0; i < vowelCount.length; i++) {
			System.out.println( vowels[i] + " ----> "+vowelCount[i]);
		}
	}

}
