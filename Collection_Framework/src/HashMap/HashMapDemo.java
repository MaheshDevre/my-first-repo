package HashMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashMapDemo {

	
		public static void main(String args[]) throws IOException
		{
			
			HashMap<String, Long>  hm = new HashMap<String, Long>();

			
			String name,str;
			Long phno;
			BufferedReader br = new BufferedReader(new 
			InputStreamReader(System.in));
		    while(true)
			{
				System.out.println("1 Enter Phone entries");
				System.out.println("2 Loop up in the book");
				System.out.println("3 Display Name sin book");
				System.out.println("4 Exit");

				System.out.print("Your choice: ");
				int n= Integer.parseInt(br.readLine());

				switch(n)
				{
					case 1: System.out.print("Enter name: ");
						name=br.readLine();
						System.out.print("Enter phno: ");
						str=br.readLine();
						phno=new Long(str);
						
						hm.put(name, phno);
						break;
					
					case 2:  System.out.print("Enter name: ");
						name=br.readLine();
						name=name.trim();
						
						phno=hm.get(name);
						System.out.println("Phno: "+phno);
						break;
					
					case 3: 
			            Set<String>  set = new HashSet<String>();
						set=hm.keySet();
						System.out.println(set);
						break;
					case 4: return;

				}
			}
		

	}

}
