package FSG_Notes;

public class Compare  {

	public static void main(String[] args) {
		MyClass obj1=new MyClass(15);
		MyClass obj2=new MyClass(15);
		
		
		Integer obj3=new Integer(15);
		Integer obj4=new Integer(15);
		
		if(obj1.equals(obj2))
			System.out.println("obj1 and obj2 are same");
		else
			System.out.println("obj1 and obj2 are not same"); 
			
		if(obj3.equals(obj4))
			System.out.println("obj3 and obj4 are same");
		else
			System.out.println("obj3 and obj4 are not same"); 
			
	}

}
