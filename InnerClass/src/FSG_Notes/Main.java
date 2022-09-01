package FSG_Notes;

public class Main {

	public static void main(String[] args) {
		MyOuter m=new MyOuter();
		m.outer();
		System.out.println(m.a);
		
		MyOuter.MyInner oi=new MyOuter().new MyInner();
		oi.inner();

	}

}
