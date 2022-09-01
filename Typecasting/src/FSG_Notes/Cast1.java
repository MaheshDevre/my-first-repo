package FSG_Notes;
class One1
{
	void show1()
	{
		System.out.println("Super class method");
	}
}
class Two1 extends One1
{
	@Override
	void show1()
	{
		System.out.println("Sub class method");
	}
}


public class Cast1 {
	public static void main(String args[])
	
	{
		One1 o; 
		o = (One1) new Two1(); 
		o.show1();
	}


}
