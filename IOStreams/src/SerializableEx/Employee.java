package SerializableEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class Employee {
	
		private static final Employee e = null;
		private int id;
		private String name;
		private float sal;
		private Date doj;

		
		Employee(int i, String n, float s, Date d)
		{
			id=i;
			name=n;
			sal=s;
			doj=d;
		}
		
		void display()
		{
			System.out.println(id+"\t"+name+"\t"+sal+"\t"+doj);
		}
		
		static Employee getData() throws IOException
		{
			
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

			
			System.out.print("Enter id:");
			int id=Integer.parseInt(br.readLine());
			System.out.print("Enter name:");
			String name=br.readLine();
			System.out.println("Enter salary:");
			float sal=Float.parseFloat(br.readLine());
            Date d=new Date();
            return e;
		}


}
