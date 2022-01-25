package collection;

public class Basics {
	public static void main(String[] args) {
		Multi m = new Multi();
		m.run();
	}

}

class Multi extends Thread{
	
	public void run() {
		System.out.println("euninf");
	}
	
}