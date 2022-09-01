package FSG_Notes;

public class A {
	void m1() {
		try {
			String  str = "Hello";
            char ch=str.charAt(5);

			
		}catch(StringIndexOutOfBoundsException siobe) {
			System.out.println("Please see the index is within the range");
			throw siobe; 

			
		}
	}

}
