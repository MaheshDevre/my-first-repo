package ByNagoorBabu;
class A
{
	int i=10;
	void m1()
	{
		System.out.println("m1-A");
		//System.out.println(j);
	}

    class B
    {
	   int j=20;
	  // static int k=30;
	   static final int k=30;
	   void m2()
	   {
		     System.out.println("m2-B");
		     System.out.println(j);
	   }
	   void m3()
	   {
		      System.out.println("m3-B");
	   }
    }
}

class Test 
{
	public static void main(String[] args) 
	{
		A a=new A();
		System.out.println(a.i);
		a.m1();
		//a.m2()//CE
        A.B ab=new A().new B();
        System.out.println(ab.j);
        ab.m3();
        //ab.m1();//CE

	}
}




