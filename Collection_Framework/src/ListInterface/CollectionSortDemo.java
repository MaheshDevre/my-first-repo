package ListInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionSortDemo {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("N");
		//l.add(new Integer(10));//CCE
		//l.add(null);//NPE
		System.out.println("Before Sorting "+l);
		Collections.sort(l, new MyComparator());
		System.out.println("After Sorting "+l);

	}

}
class MyComparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		String s1=(String)o1;
		String s2=o2.toString();
		return s2.compareTo(s1);
	}
	
}
