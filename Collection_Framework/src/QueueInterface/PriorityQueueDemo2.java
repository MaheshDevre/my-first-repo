package QueueInterface;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo2 {

	public static void main(String[] args) {
		PriorityQueue p=new PriorityQueue(15,new MyComparator1());
		p.offer("A");
		p.offer("Z");
		p.offer("L");
		p.offer("B");
		System.out.println(p);
	}

}
 class MyComparator1 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1=(String)o1;
		String s2=o2.toString();
		return s2.compareTo(s1);
	}

}
