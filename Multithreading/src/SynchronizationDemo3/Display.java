package SynchronizationDemo3;

public class Display {
	public void wish(String name)
	{
		;;;;;;;;;;//1 lakh lines of Code
		synchronized(this)
		{
		for(int i=0;i<10;i++)
		{
			System.out.println(" Good Morning");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
				System.out.println(name);
		}
	}
		;;;;;;;;;;;;;;//1 lakh lines of code

}}
