package com.digital.numbers;

import java.util.ArrayList;

public class WordCount {


	static int wordCount(String string) {
		int count=0;  
		if (string == null || string.isEmpty()) {
			return 0; 
		} 
		String[] words = string.split("[\\.,\\s!;?:\"]+");
		String result = "";
		  for (int i = 0; i < string.length(); i++) {
	            if (string.charAt(i) > 64 && string.charAt(i) <= 122 || string.charAt(i) == ' '|| string.charAt(i)==45) {
	                result = result + string.charAt(i);
	            }
	        }
		
		
		ArrayList<String> list = new ArrayList<>();
		for (String string2 : words) {
			list.add(string2);
		}
		for (String string2 : list) {
			boolean flag = false;
			for (int i = 0; i < string2.length(); i++) {
				if((string2.charAt(i)!='0')&&
						(string2.charAt(i)!='1')&&
						(string2.charAt(i)!='2')&&
						(string2.charAt(i)!='3')&&
						(string2.charAt(i)!='4')&&
						(string2.charAt(i)!='5')&&
						(string2.charAt(i)!='6')&&
						(string2.charAt(i)!='7')&&
						(string2.charAt(i)!='8')&&
						(string2.charAt(i)!='9')
						) {
					flag = false;
				}
				else {
					flag = true;
				}
			}
			if(!flag) {
				count ++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

//		String sentence = "How many eggs are in a half-dozen, 13?";
//		String sentence = "he is a good programmer, he won 865 competinjdhd, but sometimes he dont. what do you think? All test-cases should pass. done-done?";
		String sentence = "jds dsaf lkdf kdsa fkndsf, adhbf ldka ads? asd dfdal ds bf[l. akf dhi ds 878 dwa we de 7678 hg RAMU 765 dj.";
		int numCount = wordCount(sentence);
		System.out.println(numCount);

	}

}
