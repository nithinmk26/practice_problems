package String;

import java.util.Arrays;

public class Anagram {
	public static void isAnagram(String n1,String n2) {
		n1.replaceAll("\\s", "");
		n2.replaceAll("\\s","");
		
		if(n1.length()!=n2.length()) {
			System.out.println("Not ANagram..!");
		}
		
		char[] name1 = n1.toLowerCase().toCharArray();
		char[] name2 = n2.toLowerCase().toCharArray();
		
		Arrays.sort(name1);
		Arrays.sort(name2);
		
		boolean isAna = true;
		for (int i = 0; i < name2.length; i++) {
			if(name1[i]!=name2[i]) {
				System.out.println("Not Anagram...");
				isAna=false;
				break;
			}
		}
		if(isAna) {
			System.out.println("Anagram..");
		}
//		
//		if(Arrays.equals(name1, name2)) {
//			System.out.println("Anagrams...!");
//		}
//		else
//			System.out.println("Not a Anagram..!");
//		
	}

	public static void main(String[] args) {
		String name1 = "Nanda Nithin";
		String name2 = "iithNn Danna";
		
		 isAnagram(name1,name2);
		
	}

}
