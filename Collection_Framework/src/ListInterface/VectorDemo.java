package ListInterface;

import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) 
	{
		
		Vector<Integer> v = new Vector<Integer>();

		
		int x[]={22, 20, 10, 40, 15, 60};

		
		for(int i=0;i<x.length;i++)
		{
			v.add(x[i]);
		}

		
		System.out.println("Vector elements:");
		for(int i=0;i<v.size();i++)
		{
			System.out.println(v.get(i));
		}

		
		System.out.println("Elements using ListIterator:");
		ListIterator lit=v.listIterator();

		System.out.println("In forward director:");
		while(lit.hasNext())
			System.out.print(lit.next()+"\t");

		System.out.println("\n In backward direction:");
		while(lit.hasPrevious())
			System.out.print(lit.previous()+"\t");
	}


}
