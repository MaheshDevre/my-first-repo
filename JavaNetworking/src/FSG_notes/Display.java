package FSG_notes;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class Display {
	public static void main(String args[]) throws Exception
	{
		
		URL obj=new URL("http://www.yahoo.com/index.html");

		
		URLConnection conn=obj.openConnection();

		
		System.out.println("Date: "+new Date(conn.getDate()));
		System.out.println("Content-type: "+conn.getContentType());

		
		System.out.println("Expirty: "+conn.getExpiration());

		
		System.out.println("Last modified: "+new Date(conn.getLastModified()));

		
		int l = conn.getContentLength();

		System.out.println("Length of content: "+l);

		if(l==0)
		{
			System.out.println("Content not available");
			return;
		}
		else
		{
			int ch;
			InputStream in=conn.getInputStream();
			
			while((ch=in.read())!=-1)
				System.out.print((char)ch);
		}
	}


}
