package ListInterface;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) 
	{
		
		ArrayList<String> arl = new ArrayList<String>();

		
		arl.add("apple");
		arl.add("Mango");
		arl.add("Grape");
		arl.add("Guava");

		
		System.out.println("Contents:"+arl);

		
		arl.remove(3);
		arl.remove("Apple");

		
		System.out.println("Contents after Removing: "+arl);
        System.out.println("Size of ArrayList: "+arl.size());
        System.out.println("Extracting using Iterator:");

		
		Iterator it=arl.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}


}
