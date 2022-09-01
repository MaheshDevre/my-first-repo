package FSG_Notes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Convert {

	public static void main(String[] args) throws IOException {
		BufferedReader   br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter an integer: ");
		String   str=br.readLine();
		
		
		int   i=Integer.parseInt(str);
		System.out.print("In decimal:"+i);

		
		str=Integer.toBinaryString(i);
		System.out.println("In Binary: "+str);

		str=Integer.toHexString(i);
		System.out.println("In hexadecimal: "+str);

		str=Integer.toOctalString(i);
		System.out.println("In Octal: "+str);

		
	}

}
