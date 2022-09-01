package NagoorBabu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileInputStreamEx {

	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("D:\\iostream\\My.txt");
		int size=fis.available();
		byte b[]=new byte[size];
		fis.read(b);
		String data=new String(b);
		System.out.println(data);

	}

}
