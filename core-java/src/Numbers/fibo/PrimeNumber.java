package Numbers.fibo;

public class PrimeNumber {
	
	public static boolean isPrimeNum(int num) {
		int sqrt = (int) (Math.sqrt(num) +1);
		System.out.println(sqrt);
		for (int i = 2; i < sqrt; i++) {
			if(num%i==0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int value = 12;
		String res = isPrimeNum(value) ?  "Prime Number" :"Not Prime number";
		System.out.println(res);
	}

}
