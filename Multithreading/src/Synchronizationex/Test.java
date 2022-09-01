package Synchronizationex;
class Institute{
	 public static void classRoom(String facultyName)  {
		synchronized(Institute.class){for(int i=1;i<=10;i++)
		{
			System.out.println(i+" class Takin by "+facultyName);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}}
		
	}
	 public void exam()
	 {
		 for(int i=1;i<=10;i++)
			{
				System.out.println(i+" class Taking by "+Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		 
	 }
	
}
class MyThread extends Thread{
	Institute ins;
	String facultyName;
	public void run() {
		ins.classRoom(facultyName);
		
	}
	
	
	MyThread(Institute ins,String facultyName){
		this.ins=ins;
		this.facultyName=facultyName;
	}
}

public class Test {

	public static void main(String[] args) {
		Institute ins=new Institute();
		MyThread mt=new MyThread(ins,"RamChandra");
		MyThread mt1=new MyThread(ins,"Mahesh");
		mt.start();
		
		
		mt1.start();
		//
		ins.exam();
		
		}
	}
