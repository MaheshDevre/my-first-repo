package TreeSetEx2;

public class Employee implements Comparable
{
	String name;
	int eid;
	public Employee(String name, int eid) {
		super();
		this.name = name;
		this.eid = eid;
	}
	@Override
	public String toString() {
		return name+"--"+eid;
	}
	@Override
	public int compareTo(Object o) {
		int eid1=this.eid;
		Employee e=(Employee)o;
		int eid2=this.eid;
		if(eid1<eid2)
		{
			return -1;
		}
		else if(eid1>eid2)
		{
			return 1;
		}
		else return 0;
	}
	

}
