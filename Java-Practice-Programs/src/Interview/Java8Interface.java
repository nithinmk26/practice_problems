package Interview;

public interface Java8Interface {
	
	default void m1() {
		System.out.println("Default Method");
	}

	public static void m3() {
		System.out.println("Static Method");
	}
	
	public void m2();
}

