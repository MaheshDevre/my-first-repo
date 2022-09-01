package FileClassEx;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class Contents {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter dirpath:");
		String dirpath=br.readLine();

		System.out.println("Enter dirname: ");
		String dname=br.readLine();

		
		File f=new File(dirpath, dname);

		
		if(f.exists())
		{
	
			String arr[]=f.list();

			
			int n=arr.length;

			
			for(int i=0;i<n;i++)
			{
				System.out.print(arr[i]);
                File f1=new File(arr[i]);
				if(f1.isFile())
					System.out.println(": is a file");
				if(f1.isDirectory())
					System.out.println(" : is a Directory");
			}
			System.out.println("No of Entries in the is directory:"+n);
		}
		else
			System.out.println("Directory does not exist");

	}

}
