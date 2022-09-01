package NagoorBabu;
import java.io.*;
public class ConsoleEx {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("User Name");
		String uname=br.readLine();
		System.out.println("Password");
		String pwd=br.readLine();
		if(uname.equals("durga")&&pwd.equals("durga"))
				{
			        System.out.println("User Login is Succesfull");
				}
		else
		{
			        System.out.println("User Login is Failure");
		}
		
	}

}
