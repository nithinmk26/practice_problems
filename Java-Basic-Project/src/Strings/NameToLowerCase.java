package Strings;

public class NameToLowerCase {

	public static void main(String[] args) {
		String name = "The Sky is Blue";
	
	
		System.out.println(convertToLowerCase(name));
		
	}

	public static String convertToLowerCase(String name) {
		String  lowName="";
		char lowChar = ' ';
		for (int i = 0; i < name.length(); i++) {
			if(name.charAt(i)>= 'A' && name.charAt(i)<='Z') {
				lowChar=  (char) (name.charAt(i)+32);
			}
			else {
				lowChar=(char) name.charAt(i);
			}
			lowName+=lowChar;
		}
		
		return lowName;
	}

}
