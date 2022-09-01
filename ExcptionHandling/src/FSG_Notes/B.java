package FSG_Notes;

public class B {

	public static void main(String[] args) {
		A a=new A();
		try {
			a.m1();
		}catch(StringIndexOutOfBoundsException siobe) {

			System.out.println("I caught rethrown exception");

			
		}
	}

}
