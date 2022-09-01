package FSG_NOTES;
class MyThread4 implements Runnable
{
	
	String str;

	MyThread4(String str)
	{
		this.str=str;
	}
	
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(str+" : "+i);
			try
			{
				Thread.sleep(2000);
				
			}
			catch(InterruptedException  ie)
			{
				ie.printStackTrace();
			}
		}
	}
}


public class Theatre {
	public static void main(String args[])
	{
		
		MyThread4 obj1=new MyThread4("Cut the ticket");
		MyThread4 obj2=new MyThread4("Show the seat");

		
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);

		
		t1.start();
		t2.start();
	}


}
