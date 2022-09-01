package NagoorBabu;
import java.io.*;
public class BufferReaderEx2 {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter First Value");
		String val1=br.readLine();
		System.out.println("Enter Second Value");
		String val2=br.readLine();
		int fval=Integer.parseInt(val1);
		int sval=Integer.parseInt(val2);
		System.out.println("Adddition  :"+(fval+sval));
		
		
		
		
	}

}
