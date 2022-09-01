package MapInterface;

import java.util.HashMap;

public class WeakHashMap {

	public static void main(String[] args) throws Exception {
		HashMap m=new HashMap();
		Temp t=new Temp();
		m.put(t,"durga");
		System.out.println(m);
		t=null;
		System.gc();
		Thread.sleep(1000);
		System.out.println(m);

	}

}
class Temp
{
	public String toString()
	{
		return "temp";
	}
	public void finalize()
	{
		System.out.println("Finalize method Called"
				+ "");
	}
	
}