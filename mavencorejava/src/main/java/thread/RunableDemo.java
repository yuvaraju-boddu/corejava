package thread;

public class RunableDemo implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<=6; i++) {
			System.out.println(i);
		}
		System.out.println("RunableDemo.run()");

	}

}
