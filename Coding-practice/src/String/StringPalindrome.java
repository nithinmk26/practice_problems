package String;

public class StringPalindrome {
	
	public static boolean isPalindrome(String name) {
		String rev="";
		for(int i =name.length()-1;i>=0;i--) {
			rev=rev + name.charAt(i);
		}
		if(rev.equals(name)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		String name = "nitiN";
		String isPalin = isPalindrome(name.toLowerCase())?"Palin":"Not Palin";
		System.out.println(isPalin);
	}

}
