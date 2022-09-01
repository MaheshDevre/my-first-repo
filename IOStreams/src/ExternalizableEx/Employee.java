package ExternalizableEx;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable {
	int eid;
	transient String ename;
	double esal;
	String edepartname;
	String eadd;
	public Employee() {}
	public Employee(int eid, String ename, double esal, String edepartname, String eadd) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.edepartname = edepartname;
		this.eadd = eadd;
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		System.out.println("readExternal method executing");
		out.writeObject(ename);
		out.writeObject(edepartname);
		
	}
	@Override
	public void readExternal(ObjectInput oi) throws IOException, ClassNotFoundException {
		System.out.println("writeExternal method executing");
		ename = (String)oi.readObject();
		edepartname=(String)oi.readObject();
		
		
	}

}
