package FSG_notes;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client1 {
	public static void main(String args[]) throws Exception
	{
		Socket s=new Socket("localhost",777);

		
		InputStream obj=s.getInputStream();

		
		BufferedReader br=new BufferedReader(new InputStreamReader(obj));

		
		String str;
		while((str=br.readLine())!=null)
			System.out.println("From server: "+str);

		
		br.close();
		s.close();
	}


}
