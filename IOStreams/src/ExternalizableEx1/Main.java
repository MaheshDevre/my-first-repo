package ExternalizableEx1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	
		public static void main(String[] args) throws Exception, IOException{  
	           File f= new File("Test.txt");  
	           User u= new User("JavaTpoint",25);  
	           ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f));    
	           out.writeObject(u);    
	           ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));  
	           u=(User)in.readObject();  
	           System.out.println("After De externalization username: " +u.getUserName()+
	        		   " and age is:"+u.getAge());     
	       

	}

}
