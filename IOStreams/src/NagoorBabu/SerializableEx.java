package NagoorBabu;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable
{
	int eno;
	String name;
	double sal;
	String add;
	public Employee(int eno, String name, double sal, String add) {
		super();
		this.eno = eno;
		this.name = name;
		this.sal = sal;
		this.add = add;
	}
	public void getEmployeeDetails()
	{
		System.out.println("Employee Details");
		System.out.println("********************");
		System.out.println("Employee Number  :"+eno);
		System.out.println("Employee Name    :"+name);
		System.out.println("Employee Salary  :"+sal);
		System.out.println("Employee Address :"+add);
	}
	

}

public class SerializableEx {

	public static void main(String[] args) throws IOException {
		FileOutputStream foi=new FileOutputStream("abc.txt");
		ObjectOutputStream oos=new ObjectOutputStream(foi);
		
		Employee emp1=new Employee(111,"AAA",5000,"Hyd");
		System.out.println("Employee Details Before Serialization");
		emp1.getEmployeeDetails();
		oos.writeObject(emp1);
		System.out.println();
		
		FileInputStream fis=new FileInputStream("abc.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employee emp2=(Employee)emp1;
		System.out.println("Employee Details After Deseriaization");
		emp2.getEmployeeDetails();
	}

}
