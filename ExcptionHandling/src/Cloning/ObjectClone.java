package Cloning;

import java.util.Scanner;

class Employee implements Cloneable
{
	String name,id;

	public Employee(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String toString() {
		return "name="+name+"\nid="+id;
		
	}
	public Employee clone() throws CloneNotSupportedException {
		return (Employee)super.clone();
	}
	
}

public class ObjectClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.nextLine();
		System.out.println("Enter id");
		String empid=sc.nextLine();
		Employee obj1=new Employee(name,empid);
		System.out.println("... Display from Original Object...");
		System.out.println(obj1);
		System.out.println("hashCode of obj1 "+obj1.hashCode());
		Employee obj2=obj1.clone();
		System.out.println("Display the clone object");
		System.out.println(obj2);
		System.out.println("HashCode of obj2 "+obj2.hashCode());
		sc.close();
	}

}
