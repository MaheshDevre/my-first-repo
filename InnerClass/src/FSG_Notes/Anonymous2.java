package FSG_Notes;
interface Popcorn2
{
	public void pop();
}
class Food2
{
	
	Popcorn2  p1=new Popcorn2()
	{
		public void pop()
		{
			System.out.println("Food:pop........");
		}
	};
}


public class Anonymous2 {
	public static void main(String args[])
	{
		
		Food2 f1=new Food2();
			f1.p1.pop();
	}


}
