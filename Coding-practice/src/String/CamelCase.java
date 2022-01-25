package String;

public class CamelCase {

	public static void main(String[] args) {
		String line = "you are beautiful girl";
		line.toLowerCase();
		String[] words = new String[line.length()];
		int k =0;
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<line.length();i++) {
			if(line.charAt(i)!=' ') {
				sb.append(line.charAt(i));
				if(i==line.length()-1) {
					words[k++]=sb.toString();
					sb.setLength(0);
				}
			}
			else {
				words[k++]=sb.toString();
				sb.setLength(0);
			}
		}
		
		StringBuffer sbuf = new StringBuffer();
		int j =0;
		for (int l = 0; l < k; l++) {
			String word = words[l];
			StringBuffer newCamelWord = new StringBuffer();
			for (int i = 0; i < word.length(); i++) {
				if(i==0) 
				  newCamelWord.append((char)(word.charAt(0)-32));
				else
					newCamelWord.append(word.charAt(i));
				
			}
			words[j++]=newCamelWord.toString();
			newCamelWord.setLength(0);
		}
		
		System.out.println("Camel Case words---");
		for (int i = 0; i < k; i++) {
			System.out.print(words[i]+" ");
		}
	}

}
