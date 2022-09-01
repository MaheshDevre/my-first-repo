package NagoorBabu;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) throws Exception {
		FileWriter fw=new FileWriter("D:\\iostream\\My.txt",true);
		String data="Hyderabad-38";
		char[] ch=data.toCharArray();
		fw.write(ch);
		fw.close();
	}

}
