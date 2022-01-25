package String;

import java.util.stream.Collectors;

public class RemoveDupliFromString {

	public static void main(String[] args) {
		String line = "You Are beautiful girl";
		System.out.println("Expected - youbtfg");
		line.toLowerCase();
		line.chars().distinct().forEach(e->System.out.print((char)e));
//		char[] chArray = line.toCharArray();
		
//		removeDupliFromString(line);
	}

	private static void removeDupliFromString(char[] chArray) {
//		chArray.
	}

//	private static void removeDupliFromString(String line) {
//		StringBuffer sb =  new StringBuffer();
//		for (int i = 0; i < line.length()-1; i++) {
//			 if(line.charAt(i) != line.charAt(i+1)) {
//				 sb.append(line.charAt(i));
//			 }
//		}
//		sb.append(line.charAt(line.length()-1));
//		System.out.println("Actual - "+sb.toString());
//	}

}
