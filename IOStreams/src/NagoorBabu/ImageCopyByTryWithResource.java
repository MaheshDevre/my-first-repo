package NagoorBabu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ImageCopyByTryWithResource {

	public static void main(String[] args){
		try
		(
			FileInputStream fis=new FileInputStream("D:\\iostream\\Nagya.jpg");
			FileOutputStream fos=new FileOutputStream("D:\\\\iostream\\\\MaheshDeore.jpg");
			
		)
		
		{
			int size=fis.available();
			byte b[]=new byte[size];
			fis.read(b);
			fos.write(b);
			System.out.println("Image Copy from D:\\\\iostream\\\\Nagya.jpg file to D:\\\\\\\\iostream\\\\\\\\Mahesh.jpg");
			fis.close();
			fos.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		


	}

}
