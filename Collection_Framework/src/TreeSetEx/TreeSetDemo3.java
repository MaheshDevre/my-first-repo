package TreeSetEx;

import java.util.TreeSet;

public class TreeSetDemo3 {

	public static void main(String[] args) {
		TreeSet t=new TreeSet(new MyComparator1());
		t.add("Roja");
		t.add("ShobhaRani");
		t.add("RajaKumari");
		t.add("GangaBhavani");
		t.add("Ramulamma");
		System.out.println(t);
	}

}
