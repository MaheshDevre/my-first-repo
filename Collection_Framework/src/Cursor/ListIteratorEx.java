package Cursor;
import java.util.*;

public class ListIteratorEx {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("balakrishna");
		l.add("venki");
		l.add("chiru");
		l.add("nag");
		System.out.println(l);
		ListIterator litr=l.listIterator();
		while(litr.hasNext()) {
			String s=(String)litr.next();
			if(s.equals("venki"))
			{
				litr.remove();//b c n
			}
			else if(s.equals("nag"))
			{
				litr.add("chitu");//c b c n
			}
			else if(s.equals("chiru"))
			{
				litr.set("charan");
			}
			
		}
		System.out.println(l);
	}

}
