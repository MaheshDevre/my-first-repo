package FSG_Notes;

public class MyOuter 
{
	int a=30;
	public void outer()
	{
		System.out.println("outer()");
	}
	class MyInner
	{
		public void inner()
		{
			System.out.println("inner()");
			outer();
			System.out.println(a);
		}
	}

}
