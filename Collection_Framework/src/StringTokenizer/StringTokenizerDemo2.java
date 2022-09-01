package StringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerDemo2 {
	public static void main(String args[])
	{
		
		String str="He is a gentle man";
		
		
		StringTokenizer st=new StringTokenizer(str," ");

		
		System.out.println("The tokens are: ");

		while(st.hasMoreTokens())
		{
			String one=st.nextToken();
			System.out.println(one);
		}
	}	


}
