package Strings;

public class WordsReverse {
	
	public static void main(String[] args) {
		String lineOfWords = "Nanda Nithin Kumar";
		String reversedString = "";
		String[] words = lineOfWords.split(" ");
		String[] reversedWord = new String[words.length];
		String newWord="";
		for (int i = 0; i < words.length; i++) {
			for (int j = words[i].length()-1; j >= 0 ; j--) {
			newWord+=words[i].charAt(j);
			}
			reversedWord[i]=newWord;
			newWord="";
		}
		
			reversedString = String.join(" ", reversedWord);
			System.out.println(lineOfWords);
			System.out.println(reversedString);
	}

}
