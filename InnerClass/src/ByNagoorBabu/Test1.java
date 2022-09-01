package ByNagoorBabu;
class A1
{
	class B1
	{
		void m1()
		{
			System.out.println("m1-B1");
		}
	}
	class C1 extends B1
	{
		void m2()
		{
			System.out.println("m2-C1");
		}
		
	}
}
public class Test1 {

	public static void main(String[] args) {
		A1.B1 a1b1=new A1().new B1();
		a1b1.m1();
		//a1b1.m2();CE
		
		A1.C1 a1c1=new A1().new C1();
		a1c1.m1();
     
		
		a1c1.m2();
		
		

	}

}
