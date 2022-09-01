package HashTable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {
	public static void main(String args[]) throws IOException
	{
		
		Hashtable<String, Integer> ht= new Hashtable<String, Integer>();
		ht.put("Ajay",50);
		ht.put("Sachin",77);
		ht.put("Gavaskar",44);
		ht.put("Kapil",60);
		ht.put("Dhoni",88);

		
		System.out.println("The player names: ");
		Enumeration<String> e = ht.keys();
		while(e.hasMoreElements())
			System.out.println(e.nextElement());

		
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter player name: ");
		String name=br.readLine();
		name=name.trim();

		
		Integer score=ht.get(name);
		if(score!=null)
		{
			
			int sc=score.intValue();
			System.out.println(name+" Scored: "+sc);
		}
		else
		{
			System.out.println("Player not found");
		}
	}


}
