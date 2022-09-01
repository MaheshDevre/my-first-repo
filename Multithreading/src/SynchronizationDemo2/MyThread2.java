package SynchronizationDemo2;

public class MyThread2 implements Runnable {
	Display d;
	public boolean stop;

	 MyThread2(Display d) {
		
		this.d = d;
	}
	public void run()
	{
		d.displayc();
	}

}
