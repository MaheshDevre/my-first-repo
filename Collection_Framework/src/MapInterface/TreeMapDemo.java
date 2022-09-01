package MapInterface;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap t=new TreeMap();
		t.put(100,"ZZZ");
		t.put(103,"YYY");
		t.put(101,"XXX");
		t.put(104,106);
		//m.put("FFFF","XXX");-->CCE
		//m.put(null,"XXX");-->NPE
		System.out.println(t);
		}
	


}
