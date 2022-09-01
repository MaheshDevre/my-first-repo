package NagoorBabu;
import java.io.*;

public class ConsoleEx2 {

	public static void main(String[] args) throws Exception {
		Console c=System.console();
		String uname=c.readLine("User Name");
		char[] pwd=c.readPassword("Password :");
		String upwd=new String(pwd);
		if(uname.equals("durga") && upwd.equals("durga"))
		{
	        System.out.println("User Login is Succesfull");
		}
         else
        {
	        System.out.println("User Login is Failure");
        }
				
	}

}
