package FSG_NOTES;

public class CurrentThread {
	public static void main(String args[])
	{
		System.out.println("Let us find current thread");
		Thread t=Thread.currentThread();
		System.out.println("Current thrad= "+t);
		System.out.println("Its name= "+t.getName());
	}


}
