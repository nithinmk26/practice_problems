package Strings;

public class IncreSuccedingAlphabet {
	
	public static void main(String[] args) {
		String name = "The Sky is Blue";
		System.out.println(NameToLowerCase.convertToLowerCase(incrememtSuccesingAlphabet(name)));
		
	}

	private static String incrememtSuccesingAlphabet(String name) {
		String increName = "";
		char succedChar = ' ';
		for (int i = 0; i < name.length(); i++) {
			if(name.charAt(i)=='z')
				succedChar = (char) (name.charAt(i) - 25);
			else if(name.charAt(i)=='Z')
				succedChar = (char) (name.charAt(i) - 25);
			else if(name.charAt(i)==' ')
				succedChar =name.charAt(i);
			else
				succedChar = (char) (name.charAt(i) + 1);
			increName +=succedChar;
		}
		
		return increName;
	}

}
//a -96    z - 122
//A - 65   Z - 90

//uif tlz jt cmvf