package ArrayDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Group {
	public static void main(String args[]) throws Exception, IOException
	{
		
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
	
		
		Employee  arr[ ] = new Employee[5];
	
		
		for(int i=0;i<5;i++)
		{
			System.out.print("Enter id: ");
			int id=Integer.parseInt(br.readLine());
	
			System.out.print("Enter name: ");
			String name=br.readLine();

			arr[i] = new Employee(id, name);
		}

		System.out.println("The Employee data is : ");
	
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i].displayData();
		}
	}


}

