package FSG_Notes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ClassCastExceptionExample {
	

	  public ClassCastExceptionExample()
	  {
	    List list = new ArrayList();
	    list.add("one");
	    Iterator it = list.iterator();
	    while (it.hasNext())
	    {
	     
	      Integer i = (Integer)it.next();
	    }
	  }

	  public static void main(String[] args)
	  {
	    new ClassCastExceptionExample();
	  }

	}



