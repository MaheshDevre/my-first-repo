package NagoorBabu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class CopyImage {

	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("D:\\iostream\\Nagya.jpg");
		int size=fis.available();
		byte b[]=new byte[size];
		fis.read(b);
		
		FileOutputStream fos=new FileOutputStream("D:\\\\iostream\\\\Mahesh.jpg");
		fos.write(b);
		System.out.println("Image Copy from D:\\\\iostream\\\\Nagya.jpg file to D:\\\\\\\\iostream\\\\\\\\Mahesh.jpg");
		fis.close();
		fos.close();

	}

}
