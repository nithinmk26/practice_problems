package Numbers;

public class CountNumber {

	public static void main(String[] args) {
		int number = 12345;
		
		int count = 0;
		int sumOfdigits=0;
		
		while (number!=0) {
			sumOfdigits+=number%10;
			number/=10;
			count++;
	
		}
		System.out.println("SUM - "+sumOfdigits);
		System.out.println("Count - " +count);
	}
	

}
