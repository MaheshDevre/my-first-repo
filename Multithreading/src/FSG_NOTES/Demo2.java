package FSG_NOTES;

import SynchronizationDemo2.MyThread2;

class MyThread1 extends Thread
{
	boolean  stop = false;
	
	public void run()
	{
		
		for(int i=1;i<=100000;i++)
		{
			System.out.println(i);
			if(stop)
			     return;
		}
	}
}


public class Demo2 {
	public static void main(String args[])
	{
		
		//MyThread2 obj1 = new  MyThread2(null);
		
		//Thread t = new Thread(obj1);

		
		//t.start();  
		//System.in.read();  
		//obj1.stop=true;
	}


}
