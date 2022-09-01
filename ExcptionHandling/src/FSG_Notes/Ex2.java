package FSG_Notes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Sample
{
	
	private String name;

	
	void accept() throws IOException
	{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter name: ");
		name = br.readLine();
	}

	void display()
	{
		System.out.println("Name: "+name);
	}
}



public class Ex2 {
	public static void main(String args[]) throws IOException
	{
		Sample s=new Sample();
		s.accept();
		s.display();
	}

}
