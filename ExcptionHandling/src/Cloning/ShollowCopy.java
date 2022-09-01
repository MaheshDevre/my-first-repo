package Cloning;
class Box implements Cloneable
{
	private int value;
	Box(int value)
	{
		value=0;
	}
	public void setvalue(int v)
	{
		value=v;
	}
	public int getvalue()
	{
		return value;
	}
	public Object clone() throws CloneNotSupportedException
	{
		Box b=new Box(7);
		b.setvalue (getvalue());
		return b;

	}
}

public class ShollowCopy {

	public static void main(String[] args) throws CloneNotSupportedException {
		Box x= new Box(7);
		x.setvalue(7);
		
		Box y=(Box)x.clone();

		System.out.println("Content of X:"+x.getvalue());
		System.out.println("Content of y:"+y.getvalue());
		y.setvalue(11);
		System.out.println("Content of X:"+x.getvalue());
		System.out.println("Content of y:"+y.getvalue());


		
	}

}
