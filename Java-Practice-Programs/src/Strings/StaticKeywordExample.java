package Strings;

public class StaticKeywordExample {
	
//	final int x;
//	static {
//		x=10;//Error  x is not static
//	}
	
//	public StringQuestions() {
//		x=10; // possible
//	}
//	
//	{
//		x=10;//possible in instance block
//	}
	static final int x;
	static {
		x = 10;
	}
//	x=10;
	
//	public static void m1() {
//		x=10;//ERROR cant initailize static in static method /caz method load after variable loads
//	}


	public static void main(String[] args) {

	}

}
