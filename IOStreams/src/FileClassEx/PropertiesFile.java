package FileClassEx;

import java.io.File;

public class PropertiesFile {

	public static void main(String[] args) {
		
				String name=args[0];
				File f=new File(name);

				
				System.out.println("File name: "+f.getName());
				System.out.println("Path: "+f.getPath());
				System.out.println("Absolute path: "+f.getAbsolutePath());
				System.out.println("Exists: "+f.exists());

				if(f.exists())
				{
					System.out.println("Is writeable: "+f.canWrite());
					System.out.println("Is readable: "+f.canRead());
					System.out.println("Is a directory: "+f.isDirectory());
					System.out.println("File size in bytes: "+f.length());
				}
            }
        
}
