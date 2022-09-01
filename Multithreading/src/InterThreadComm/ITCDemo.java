package InterThreadComm;
class Customer{    
int amount=10000;    
    
synchronized int withdraw(int wamt){  
	System.out.println("Amount before withdraw"+amount);
    System.out.println("going to withdraw...");    
    
if(wamt<amount)
{    
System.out.println("Less balance; waiting for deposit...");    
try{
	wait();
   }catch(Exception e){}    
}    
 
System.out.println("withdraw completed...");
amount=amount-wamt;
System.out.println("WIthdraw Amount"+amount);
return wamt;
}    
    
synchronized void deposit(int damt){    
System.out.println("going to deposit...");
System.out.println("Amount before deposit "+amount);
amount=amount+damt; 
System.out.println("deposit completed... ");    
notify();    
}    
}    

public class ITCDemo {
	public static void main(String args[]){    
		final Customer c=new Customer();    
		new Thread(){    
		public void run(){
			c.withdraw(15000);
		}    
		}.start();    
		new Thread(){    
		public void run()
		{
			c.deposit(10000);
		}    
		}.start();    

}}
