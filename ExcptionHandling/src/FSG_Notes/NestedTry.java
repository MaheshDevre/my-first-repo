package FSG_Notes;

import java.io.*;

public class NestedTry {
	public static void main(String[] args) throws IOException
	{
		try
		{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in) );
			System.out.println("Enter a value");
			String stra=br.readLine();
			int a=Integer.parseInt(stra);
			System.out.println("Enter b value:");
			int b=Integer.parseInt(br.readLine());
			int c;
			c=a/b;
			System.out.println("c="+c);
			
			try
			{
				int x[]=new int[5];
				x[10]=5;
			}
			catch(ArrayIndexOutOfBoundsException aiobe)
			{
				System.out.println(aiobe);
			}
			finally
			{
				System.out.println("Inner finally");
			}
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		finally
		{
			System.out.println("Outer Finally");
		}
		System.out.println("End of the program");
	}


}
