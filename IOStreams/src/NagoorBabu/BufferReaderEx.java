package NagoorBabu;

import java.io.*;


public class BufferReaderEx {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Input Data");
		String data1=br.readLine();
		System.out.println("Enter the Same Data Again");
		int val=br.read();
		
		System.out.println("First Entered Data  :"+data1);
		System.out.println("Second Entered Data  :"+val+"["+(char)val+"]");
	}

}
