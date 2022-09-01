package FSG_Notes;
class Outer2
{
	static String str="Java";
	int a=30;

	public static void outerMethod()
	{
		System.out.println("Outer: Outer method.....");
	}
	
	
	static class Inner2
	{
		public void innerMethod()
		{
			System.out.println("Inner: inner method.....");
			System.out.println("static string:"+str);
			outerMethod();
		}
	}
}


public class StaticInner {
	public static void main(String args[])
	{
		
		Outer2.Inner2 inner=new Outer2.Inner2();
				inner.innerMethod();
	}


}
