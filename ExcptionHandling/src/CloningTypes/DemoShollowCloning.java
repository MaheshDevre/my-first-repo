package CloningTypes;
class Address implements Cloneable
{
	String hNo="1070";
	String sName="Sudhar Colony";
	String City="Hyd";
	private Object add;
	public String toString()
	{
		return "hNo="+hNo+"\nsName="+sName+"\nCity="+City;
	}
	public Address clone() throws CloneNotSupportedException
	{
		return (Address)super.clone();
	}
}
class Employee implements Cloneable
{
	String name="Mahesh";
	String id="Mahesh@123";
	Address add=new Address();
	public String toString()
	{
		return "name="+name+"\nid="+id;
	}
	public Employee clone() throws CloneNotSupportedException {
		Employee e=(Employee)super.clone();
		e.add=this.add.clone();//clone method of address class
		return e;
	}
}
public class DemoShollowCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e1=new Employee();
		System.out.println("---Original Object---");
		System.out.println(e1);
		System.out.println(e1.add);
		System.out.println("Original Object of hashCode()"+e1.hashCode());
		Employee e2=e1.clone();
		System.out.println("---Clone Object---");
		System.out.println(e2);
		System.out.println(e2.add);
		System.out.println("Clone Object of hashCode()"+e2.hashCode());
		if(e1.add==e2.add)
		{
			System.out.println("Shollow Cloning");
		}
		else
		{
			System.out.println("deep"
					+ " cloning");
		}
	}

}
