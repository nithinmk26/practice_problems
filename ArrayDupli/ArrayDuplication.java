package ArrayDupli;

import java.util.Scanner;

public class ArrayDuplication {

	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the array size: ");
		int n = scanner.nextInt();
		
		int numArray[] = new int [n];
		for (int i = 0; i < numArray.length; i++) {
			System.out.println(" Enter element - "+ (i+1));
			numArray[i] = scanner.nextInt();
		}
		
		
		int withOutDupli[] = new int[numArray.length];
		int k = 0;
		int numArraySize = numArray.length;
		int withoutDupliArraySize = withOutDupli.length;
		
		for (int i = 0; i < numArraySize; i++) {            
 			for (int j = 0; j < withoutDupliArraySize; j++) {
				if(!(numArray[i] == withOutDupli[j]) ||( withOutDupli[j]!=0)) {
					withOutDupli[k] = numArray[i];
					k++;
					break;
				}
			}
		}
		
		System.err.println("Withput Duplicates in array....");
		for (int i : withOutDupli) {
			System.out.println(i);
		}
		
	}
	
}
