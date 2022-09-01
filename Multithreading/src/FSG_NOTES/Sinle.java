package FSG_NOTES;
class MyThread3 implements Runnable
{
	public void run()
	{
		
		task1();
		task2();
		task3();
	}
	void task1()
	{
		System.out.println("This is task1");
	}
	void task2()
	{
		System.out.println("This is task2");
	}
	void task3()
	{
		System.out.println("This is task3");
	}
}


public class Sinle {
	public static void main(String args[])
	{
		
		MyThread3 obj = new  MyThread3();

		
		Thread  t1=new Thread(obj);

		
		t1.start();
	}


}
