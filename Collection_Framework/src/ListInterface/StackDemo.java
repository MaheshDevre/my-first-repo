package ListInterface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackDemo {
	public static void main(String args[]) throws IOException
	{
		
		Stack<Integer>  st = new Stack<Integer>();
        int choice = 0;
		int position, element;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		while(choice<4)
		{
			System.out.println("STACK OPERATIONS");
			System.out.println("1 Push an element");
			System.out.println("2 Pop an element");
			System.out.println("3 Search an element");
			System.out.println("4 Exit");
			System.out.println("Your Choice: ");
			
			choice = Integer.parseInt(br.readLine());

			

			switch(choice)
			{
				case 1: System.out.print("Enter element:");
					element = Integer.parseInt(br.readLine());
                    st.push(element);
					break;

				case 2: 
					Integer obj = st.pop();
					System.out.println("Poped= "+obj);
					break;

				case 3: System.out.print("Which element? ");
					element = Integer.parseInt(br.readLine());
					
					position = st.search(element);
					if(position == -1)
					{
						System.out.println("Element not found");
					}
					else
					{
						System.out.println("Position: "+position);		
					}
					break;
					
					default:
					return;
			}
			System.out.println("Stack contents: "+st);
		}
	}


}
