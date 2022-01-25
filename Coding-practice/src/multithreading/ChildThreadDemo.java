/**
 * 
 */
package multithreading;

/**
 * @author M1056182
 *
 */
public class ChildThreadDemo extends Thread{
	
	public void run() {
		PrintFromChildThread();
	}
	
	
	
	public static void PrintFromChildThread() {
		for (int i = 0; i <10; i++) {
			System.out.println("Child Thread - "+i);
			if(i==5) {
				Thread.yield();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}

class ChildRunnable implements Runnable{

	@Override
	public void run() {
		PrintFromChildThread();
	}
	

	public static void PrintFromChildThread() {
		for (int i = 0; i <10; i++) {
			System.out.println("Child Thread RUnnable - "+i);
		}
		
	}
	
}


class LowPrioThread extends Thread{
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Low Priority Thread -"+i);
		}
	}
}