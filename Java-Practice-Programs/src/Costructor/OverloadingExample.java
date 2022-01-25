package Costructor;

public class OverloadingExample {
	
	public void m1(long a, int b) {
		System.out.println("1st method");
	}
	
	public void m1(int a, int b) {
		System.out.println("2nd method");
	}
public static void main(String[] args) {
	OverloadingExample o = new OverloadingExample();
}

}

//byte->short->int->long->float->double;
//			char
