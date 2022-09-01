package FSG_Notes;
class TestEnum
{
	enum colors
	{
		YELLOW,
		GREEN,
		PINK,
		BLOCK,
	}
	colors ref;
}



public class EnumDemo {
	public static void main(String args[])
	{
		TestEnum obj=new TestEnum();
		obj.ref=TestEnum.colors.YELLOW;
		System.out.println(obj.ref);
		
		obj.ref=TestEnum.colors.GREEN;
		System.out.println(obj.ref);

		obj.ref=TestEnum.colors.PINK;
		System.out.println(obj.ref);

		obj.ref=TestEnum.colors.BLOCK;
		System.out.println(obj.ref);

	
		System.out.println("Byusing values()...");

		TestEnum.colors cs[]=TestEnum.colors.values();

		for(int i=0;i<cs.length;i++)
		{
			System.out.println(cs[i]);
		}

		
		System.out.println("By using Enhanced for loop");

		for(TestEnum.colors  c:cs)
		{
			System.out.println(c);
		}
	}


}
