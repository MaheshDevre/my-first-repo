package FSG_Notes;
class Popcorn
{
	public void pop()
	{
		System.out.println("Pop Corn: Pop method");	
	}
}
class Food
{
	
	Popcorn  p1=new Popcorn()
	{
		public void pop()
		{
			System.out.println("Food:pop....");
		}
	};
}


public class Anonymous1 {
	public static void main(String args[])
	{
		
		Food f1=new Food();
			f1.p1.pop();
	}


}
