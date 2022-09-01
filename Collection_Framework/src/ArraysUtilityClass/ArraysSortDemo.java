package ArraysUtilityClass;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSortDemo {

	public static void main(String[] args) {
		int[] a= {10,5,20,11};
		System.out.println("Primitive Array Before Sorting");
		for(int a1:a)
		{
			System.out.println(a1);
		}
		Arrays.sort(a);
		System.out.println("Primitive Array After Sorting");
		for(int a1:a)
		{
			System.out.println(a1);
		}
		String s[] = {"A","Z","B"};
		System.out.println("Object Array Before Sorting");
		for(String s1:s)
		{
			System.out.println(s1);
		}
		Arrays.sort(s);
		System.out.println("Object Array After Sorting");
		for(String s1:s)
		{
			System.out.println(s1);
		}
		Arrays.sort(s, new MyComparator());
		System.out.println("Object Array after Sorting by Comparator");
		for(String s1:s)
		{
			System.out.println(s1);
		}
		
	}

}
class MyComparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		String s1=(String)o1;
		String s2=(String)o2;
		return s2.compareTo(s1);
	}
	
}

















