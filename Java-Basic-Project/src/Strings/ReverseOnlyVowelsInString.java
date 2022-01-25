package Strings;

public class ReverseOnlyVowelsInString {

	public static void main(String[] args) {
		String name = "Helloo";
		System.out.println(reverseVowelsInString(name));
	}

	public static String reverseVowelsInString(String name) {
		String vowels = "";
		char ch=' ';
		for (int i = 0; i < name.length(); i++) {
			if(name.charAt(i) =='A' || name.charAt(i) =='E'|| name.charAt(i)=='I'
					||name.charAt(i)=='O'||name.charAt(i)=='U'||name.charAt(i)=='a'
					||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u')
			{
				vowels+=name.charAt(i);
			}
		}
		
		int vowelcount = vowels.length()-1;
		String newString = "";
		ch=' ';
		for (int i = 0; i < name.length(); i++) {
			if(name.charAt(i) =='A' || name.charAt(i) =='E'|| name.charAt(i)=='I'
					||name.charAt(i)=='O'||name.charAt(i)=='U'||name.charAt(i)=='a'
					||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u')
			{
			     ch = vowels.charAt(vowelcount);	
			     vowelcount--;
			}
			else {
				ch = name.charAt(i);
			}
			newString+=ch;
		}
		return newString;
	}

}
