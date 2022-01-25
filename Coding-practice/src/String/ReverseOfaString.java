package String;

public class ReverseOfaString {
	
	public static void reverseString(String name) {
		
		StringBuffer rev = new StringBuffer();
		for (int i = name.length()-1; i >=0; i--) {
			rev.append(name.charAt(i));
		}
		System.out.println(rev.toString());
	}
	
	public static void reverseWord(String line) {
		String[] words = new String[line.length()];
		StringBuffer word = new StringBuffer();
		int k=0;
		for (int i = 0; i < line.length(); i++) {
			if(line.charAt(i)!=' ') {
				word.append(line.charAt(i));
				if(i==line.length()-1) {
					words[k++]=word.toString();
				word.setLength(0);}
			}
			else {
				words[k++]=word.toString();
			word.setLength(0);}
		}
		
		StringBuffer rev = new StringBuffer();
		for(int i=0;i<k;i++) {
			String eachWord = words[i];
			for (int j = eachWord.length()-1; j >= 0; j--) {
				rev.append(eachWord.charAt(j));
			}
			if(i!=words.length-1)
			rev.append(" ");
		}
		System.err.println(rev);
		
	}

	public static void main(String[] args) {
		String name = "You are beautiful";
		reverseString(name);
		reverseWord(name);
		
	}

}
