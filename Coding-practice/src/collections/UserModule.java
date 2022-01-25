package collections;

public class UserModule {

	public static void main(String[] args) {
		
		String str = "aabbccbbaa";
		StringBuilder sb = new StringBuilder();
		char[] arr = str.toCharArray();
		for(int i=0;i<arr.length;i++) {
			sb.append(arr[i]);
			for(int j=i+1;j<arr.length;j++) {
				sb.append(arr[j]);
				if(isPalindrome(sb.toString())) {
					System.out.println(sb.toString());
				}
			}
			sb.setLength(0);
		}
		

	}
	
	public static boolean isPalindrome(String str) {
		String temp = str;
		StringBuilder sb = new StringBuilder();
		for(int i=str.length()-1;i>=0;i--) {
			sb.append(str.charAt(i));
		}
		if(temp.equals(sb.toString())) {
			return true;
		}
		return false;
	}

}
