package FSG_Notes;

public class MyException extends Exception {
	
		private static int accno[]={1001, 1002, 1003, 1004, 1005};

		private static String name[]={"TURNER", "ADAMS", "JAMES", "MILLER", "FORD"};

		private static double bal[]={10000.00, 12000.00, 5600.50, 999.00, 1100.55};

		
		MyException()
		{
		}

		
		MyException(String str)
		{
			super(str);
		}

		
		public static void main(String args[])
		{
			try
			{
				
				System.out.println("ACCNO"+"\t"+"CUSTOMER"+"\t"+"BALANCE");

				
				for(int i=0;i<5;i++)
				{
					System.out.println(accno[i]+"\t"+name[i]+"\t"+bal[i]);

					
					if(bal[i]<1000)
					{
						MyException me=new MyException("Balance amount is less");
						throw me;
					}
				}
			}
			catch(MyException me)
			{
				me.printStackTrace();
			}
		}

}
