package Numbers.palindrome;

public class IntPalindrome {
	
	public static int palin(int num) {
		int rev=0;
		
			int rem=0;
			while(num!=0) {
				rev+=num%10;
				num=num/10;
			}
			System.err.println(rev);
			return rev;
	}
	
	public static void main(String[] args) {
//		System.out.println(palin(3234));
		String m = "You are beautiful";
		String[] sarray = new String [5];

		String s = "";
		int j = 0;
		for(int i = 0; i<=m.length()-1;i++)
		{

		if(m.charAt(i) == ' ' )
		{
		sarray[j] = s;
		j++;
		s="";
		}
		else {
			s = s + m.charAt(i);
			if(i==m.length()-1) {
				sarray[j] = s;
			}
		
		}
		}
		for (int i = 0; i < sarray.length; i++) {
			System.err.println(sarray[i]);
		}
		
}
}
