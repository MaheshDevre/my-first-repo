package InterThreadComm;

public class Communicate1 {
	public static void main(String[] args)throws Exception
	{
	
	Producer1 obj1=new Producer1();
	
	Consumer1 obj2=new Consumer1(obj1);

	
	Thread t1=new Thread(obj1);
	Thread t2=new Thread(obj2);

	
	t1.start(); 
	t2.start(); 
	}


}
class Producer1 extends Thread
{

StringBuffer sb;


Producer1()
{
sb=new StringBuffer(); 
}

public void run()
{
synchronized(sb)
{

for(int i=1; i<=10; i++)
{
try
{
sb.append(i+" : ");
Thread.sleep(100);
System.out.println("appending");
}
catch(Exception e)
{
}
}

sb.notify();
   }
}

}
class Consumer1 extends Thread
{

Producer1 prod;

Consumer1(Producer1 prod)
{
this.prod=prod;
}

public void run()
{

System.out.println(prod.sb);
}
}

