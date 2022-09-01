package ArraysUtilityClass;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListDemo {

	public static void main(String[] args) {
		String[] s= {"A","Z","B"};
		List l=Arrays.asList(s);
		System.out.println(l);
		l.set(1,"L");
		for(String s1:s)
		{
			System.out.println(s1);
		}
		//l.add("durga");//USOE
		//l.remove(2);
		//l.set(l, new Integer(10));
	}

}
