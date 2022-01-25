
public interface staticDefault {
	
	void m1();
	
	static void m2() {
		System.out.println("Stats Method");
	}
	
	default int m3() {
		return 2;
	}

}
