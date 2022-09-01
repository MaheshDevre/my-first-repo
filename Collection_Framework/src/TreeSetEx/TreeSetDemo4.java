package TreeSetEx;

import java.util.TreeSet;

public class TreeSetDemo4 {

	public static void main(String[] args) {
		TreeSet t=new TreeSet(new MyComparator2());
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("K"));
		t.add(new StringBuffer("L"));
		System.out.println(t);
	}

}
