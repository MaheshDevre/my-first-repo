package FSG_Notes;

public class ConvertStringToNum {
	  public static void main(String[] args)
	  {
	    try
	    {
	      String s = "FOOBAR";
	      int i = Integer.parseInt(s);
	      System.out.println("int value = " + i);
	    }
	    catch (NumberFormatException nfe)
	    {
	      nfe.printStackTrace();
	    }
	  }



}
