package Strings;

public class FistCharOfWor {
	public static void main(String[] args) {
		
		/*Print only first character of the alternative word in the string
		Example- “Jack is Businessman and he is polite”
		Output-  “J B h p” */
		
		String str = "nshwoifw nodij pvvjnfoib fodfvlj kjcvb fnvjl";
		String []words = str.split(" ");
//		System.out.println(words.length);
		
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i].charAt(0));
		}
	}

}
