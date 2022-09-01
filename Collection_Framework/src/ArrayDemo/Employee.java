package ArrayDemo;

public class Employee {
	
		int  id;
		String  name;
		
		

		Employee(int  i, String  n)
		{
			id = i;
			name = n;
		}

		
		
		void displayData()
		{
			System.out.println(id+"\t" + name);
		}


}
