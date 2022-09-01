package ExternalizableEx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File f=new File("emp.txt");
		FileOutputStream fos=new FileOutputStream(f);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		Employee e=new Employee(101,"ram",7000.00,"dev","Hyd");
		oos.writeObject(e);
		System.out.println("Externaization Completed");
		
		File f1=new File("emp.txt");
		FileInputStream fis=new FileInputStream(f1);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object o=ois.readObject();
		Employee e1=(Employee)o;
		System.out.println(e1.eid);
		System.out.println(e1.ename);
		System.out.println(e1.edepartname);
		System.out.println(e1.esal);
		System.out.println(e1.eadd);
		
	}

}
