package app;

/**
 * Create a thread that extends the Thread class
 */
public class MyThread1 extends Thread {
	// You need to override the run() to put the
	// code that will run in this thread
	public void run() {
		System.out.println("MyThread1 is running");
	}
}
