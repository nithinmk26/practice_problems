/**
 * 
 */
package multithreading;

/**
 * @author M1056182
 *
 */
public class MultithreadingDemo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ChildThreadDemo child1 = new ChildThreadDemo();
		child1.start();
		LowPrioThread lt1 = new LowPrioThread();
		lt1.setPriority(Thread.MIN_PRIORITY);
		
//		try {
//			child1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		lt1.start();
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
		ChildRunnable child2 = new ChildRunnable();
		Thread childt2 = new Thread(child2);
		childt2.setPriority(8);
		childt2.start();
		
	}

}
