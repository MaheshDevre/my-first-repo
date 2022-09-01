package FSG_Notes;
class Outer1
{
	int a=10; 
	public void methodLocal()
	{
		final int b=20;
		class Inner1
		{
			void method()
			{
				System.out.println(b);
			}
		}
		
		Inner1 inner=new Inner1();
			inner.method();
	}
}



public class MethodLocalInnerClass {
	public static void main(String args[])
	{
		Outer1 obj=new Outer1();
			obj.methodLocal();
	}


}
