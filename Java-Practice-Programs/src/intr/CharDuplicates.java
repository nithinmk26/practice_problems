package intr;

import java.util.Scanner;

public class CharDuplicates {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		String name = scanner.nextLine();
		name.toLowerCase();
		char[] nameArr = new char[name.length()];
		nameArr = name.toCharArray();
		
		int count=0;
		for (int i = 0; i < nameArr.length; i++) {
			boolean isRepeat=false;
			for (int j = 0; j < nameArr.length; j++) {
				if(nameArr[i]==nameArr[j] && i!=j && nameArr[i]!=' ') {
					isRepeat=true;
					break;
			}
				
		}
			if(!isRepeat) {
				count++;
				}
			if(count==3) {
				System.out.println("Third Non repitative char - "+nameArr[i]);
				break;
			}
		}
		
	}

}
