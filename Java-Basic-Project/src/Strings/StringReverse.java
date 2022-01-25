package Strings;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name= "nanda nithin kumar";
		System.out.println(name);
		System.out.println(reverseName(name));
		System.err.println(reverseWords(name));
	}

	private static String reverseWords(String name) {
		String word="";
		
		String nameReversed="";
		char ch = ' ';
		for (int i = 0; i < name.length(); i++) {
			if(!(name.charAt(i)==' ')) {
				word+=name.charAt(i);
			}
			else if(name.length()-1 == i)
			{
				for (int j = word.length()-1; j >=0 ; j--) {
					nameReversed+=word.charAt(j);
				}
				word="";
				nameReversed+=' ';
			}
			else {
				for (int j = word.length()-1; j >=0 ; j--) {
					nameReversed+=word.charAt(j);
				}
				word="";
				nameReversed+=' ';
			}
			
		}
		return nameReversed;
	}

	public static String reverseName(String name) {
		String nameRev = "";
		char ch = ' ';
		for (int i = name.length()-1; i >=0; i--) {
			nameRev+=name.charAt(i);
		}
		return nameRev;
	}

}
