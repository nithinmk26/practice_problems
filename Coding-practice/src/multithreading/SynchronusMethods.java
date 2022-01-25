package multithreading;

public class SynchronusMethods {

	public static void main(String[] args) {
		syncMethodClass sync = new syncMethodClass();
		syncMethodClass sync1 = new syncMethodClass();
		syncMethodClass sync2 = new syncMethodClass();
		sync1.setPriority(Thread.MIN_PRIORITY);
		sync2.setPriority(Thread.MAX_PRIORITY);
		sync.start();
//		sync.yield();
		sync1.start();
		sync2.start();
	}

}


class syncMethodClass extends Thread{
	public void run() {
		printMessage();
	}
	
	public static synchronized void printMessage() {
		for (int i = 0; i < 5; i++) {
		
			System.out.println("Synchornus method called... from "+Thread.currentThread().getName() +" "+i);

		}
	}
}