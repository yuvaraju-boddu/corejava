package thread;

public class ThreadMain {
	public static void main(String[] args) {
		ThreadDemo obj = new ThreadDemo();
		obj.start();

		// Runable Example
		RunableDemo runableDemo = new RunableDemo();
		Thread thread = new Thread(runableDemo, "Nags THread");
		thread.start();
		System.out.println("ThreadMain.main()" + thread.getName());
		// runableDemo.run();
		Thread thread1 = new Thread(runableDemo, "Thread2");
		thread1.start();
		try {
			thread1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
