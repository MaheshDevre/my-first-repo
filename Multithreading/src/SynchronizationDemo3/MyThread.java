package SynchronizationDemo3;

import SynchronizationDemo.Display;

public class MyThread extends Thread {
	Display d;
	String name;
	public MyThread(Display d, String name) {
		super();
		this.d = d;
		this.name = name;
	}
	public void run()
	{
		d.wish(name);
	}
}
