package Costructor;

public class BasicString {
	
	public static void main(String[] args) {
		
		String s = new String("Nanda");
		s = s.concat("Nithin");
		System.out.println(s);
		
		
		StringBuilder sb = new StringBuilder("Nanda");
		sb.append("Nithin");
		System.out.println(sb);
	}

}
