package MapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap h=new HashMap();
		h.put("chiranjeevi",700);
		h.put("balaiah",100);
		h.put("venkatesh",200);
		h.put("nagarjuna",500);
		System.out.println(h);
		System.out.println(h.put("chiranjeevi",1000));
		
		Set s=h.keySet();
		System.out.println(s);
		
		Set s1=h.entrySet();
		System.out.println(s1);
		
		Iterator itr=s1.iterator();
		while(itr.hasNext())
		{
			Map.Entry m1=(Map.Entry)itr.next();
			System.out.println(m1.getKey()+"-----"+m1.getValue());
			if(m1.getKey().equals("nagarjuna"))
			{
				m1.setValue(10000);
			}
		}
		System.out.println(h);

	}

}
