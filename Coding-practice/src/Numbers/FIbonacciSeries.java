package Numbers;

public class FIbonacciSeries {
	
	public static int fibo(int num) {
		if(num==2 ||num==1) {
			return 1;
		}
		if(num==0) {
			return 0;
		}
		return fibo(num-1)+fibo(num-2);
		
	}

	public static void fiboSeries(int len,int start) {
		System.out.println("Fibo Series are - ");
		System.out.print(start+" "+(start+1));
		
		int a = start;
		int b = start+1;
		for (int i = 2; i < len; i++) {
			int c = a + b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
	
	public static void main(String[] args) {
		int fibLength = 8;
		int startNum = 4;
		fiboSeries(fibLength, startNum);
		
		System.out.println("FIb FUnction--");
		for (int i = 0; i <fibLength ; i++) {
			System.out.print(fibo(i)+" ");
		}
	}

}
