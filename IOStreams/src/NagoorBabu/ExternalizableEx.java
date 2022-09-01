package NagoorBabu;
import java.io.*;
/*class Student1 implements Externalizable
{
	String sid;
	String sname;
	String semail;
	String smobile;
	public Student1()
	{
		
	}
	public Student1(String sid, String sname, String semail, String smobile) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.semail = semail;
		this.smobile = smobile;
	}
	public void getStudentDetails()
	{
		System.out.println("Student Details");
		System.out.println("----------------");
		System.out.println("Student ID     :"+sid);
		System.out.println("Student Name   :"+sname);
		System.out.println("Student email  :"+semail);
		System.out.println("Student Mobile :"+smobile);
	}
	public void writeExternal(ObjectOutput oop) throws Exception
	{
		try
		{
			String[] str1=sid.split("-");
			int sno=Integer.parseInt(str1[1]);
			
			String[] str2=semail.split("@");
			String mail_Id=str2[0];
			
			String[] str3=smobile.split("-");
			long mobile_No=Long.parseLong(str3[1]);
			
			oop.writeInt(sno);
			oop.writeUTF(sname);
			oop.writeUTF(mail_Id);
			oop.writeLong(mobile_No);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void readExternal(ObjectInput oip) throws Exception
	{
		try
		{
			sid="DSS"+oip.readInt();
			sname=oip.readLine();
			semail=oip.readUTF()+"@dss.com";
			smobile="91-"+oip.readLong();
					
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
}


public class ExternalizableEx {

	public static void main(String[] args) throws Exception {
		FileOutputStream foi=new FileOutputStream("student1.txt");
		ObjectOutputStream oos=new ObjectOutputStream(foi);
		Student1 std1=new Student1("DSS-111","AAA","aaa@dss.com","91-9673922087");
		System.out.println();
		FileInputStream fis=new FileInputStream("student.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Student std2=(Student)ois.readObject();
		System.out.println("Student Details After Deserialization");
		std2.getStudentDetails();
	}

}*/
