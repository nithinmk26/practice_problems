package Numbers;

public class PrimeNumber {
	
	public static boolean isPrime(int num) {
		for (int i = 2; i < num/2; i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isPrimeNum(int num) {
		int sqrt = (int)Math.sqrt(num)+1;
		for (int i = 2; i < sqrt; i++) {
		if(num%i==0) {
			return false;
		}
		
		}
		return true;
	}
	
	public static void main(String[] args) {
		String isPrime = isPrime(181) ? "Prime":"Nor Prime";
		System.out.println(isPrime);
		String isPrimeNum = isPrimeNum(181) ? "Prime":"Nor Prime";
		System.out.println(isPrimeNum);
	}

}
