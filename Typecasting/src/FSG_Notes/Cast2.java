package FSG_Notes;
class One2
{
	void show1()
	{
		System.out.println("Super class method");
	}
}
class Two2 extends One2
{
	void show2() 
	{
		System.out.println("Sub class method");
	}
}


public class Cast2 {
	public static void main(String args[])
	{
		
		One2 o =  new Two2(); 
		Two2  t = (Two2) o; 
		t.show1();
		t.show2();

		}


}
