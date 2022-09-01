package Deadock;

public class DeadlockDemo extends Thread {
	static Thread mt=null;
	public void run()
	{
		System.out.println("run   :"+Thread.currentThread().getName());
		try {
			mt.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=1;i<=10;i++)
		{
			System.out.println("run  :"+Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main   :"+Thread.currentThread().getName());
		DeadlockDemo d=new DeadlockDemo();
		d.setName("Mahesh");
	//	mt.Thread.currentThread();
		d.start();
		d.join();
		for(int i=1;i<=10;i++)
		{
			System.out.println("main  :"+Thread.currentThread().getName());
		}
		
		
	}

}
