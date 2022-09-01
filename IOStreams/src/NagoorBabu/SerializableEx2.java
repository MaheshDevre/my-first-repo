package NagoorBabu;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable
{
	String pname;
	String padd;
}
class Student extends Person
{
	String pid;
	String pqual;
	public Student(String pname,String padd, String pid, String pqual) {
		super.pname=pname;
		super.padd=padd;
		this.pid = pid;
		this.pqual = pqual;
	}
	public void getStudentDetails()
	{
		System.out.println("Student Details");
		System.out.println("Stident Id        :"+pid);
		System.out.println("Stident Name      :"+pname);
		System.out.println("Stident Qual      :"+pqual);
		System.out.println("Stident Addreass  :"+padd);
	}
}

public class SerializableEx2 {

	public static void main(String[] args) throws Exception {
		FileOutputStream foi=new FileOutputStream("student.txt");
		ObjectOutputStream oos=new ObjectOutputStream(foi);
		Student std1=new Student("Durga","Hyd","S-111","BTech");
		System.out.println("Student Details Before Serialization");
		std1.getStudentDetails();
		oos.writeObject(std1);
		System.out.println("*********************");
		FileInputStream fis=new FileInputStream("student.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Student stu2=(Student)ois.readObject();
		System.out.println("Employee Details After Deseriaization");
		stu2.getStudentDetails();
		

	}

}
