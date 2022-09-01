package FSG_NOTES;
class  MyThread extends Thread
{
	
	public void run()
	{
		
		for(int i=1;i<=100000;i++)
		{
			System.out.println(i);
		}
	}
}


public class Demo1 {
	public static void main(String args[])
	{
		
		MyThread obj = new  MyThread();
		
		Thread t = new Thread(obj);

		
		t.start();  
	}


}
