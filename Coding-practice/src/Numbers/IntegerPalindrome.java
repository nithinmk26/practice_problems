package Numbers;

public class IntegerPalindrome {

	public static boolean isPalindrome(int num) {
		
		int sum=0;
		int temp=num;
		while(num!=0) {
			sum= sum*10 + (num%10); //5
			num/=10;
		}
		if(sum==temp) 
			return true;
		
		else
			return false;
		
	}
	public static void main(String[] args) {
		String isPalinNum = isPalindrome(567765) ? "Palin":"Not Palin";
		// TODO Auto-generated method stub
		System.out.println(isPalinNum);

	}

}
