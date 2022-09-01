package InterThreadComm;

public class Test {

	public static void main(String[] args) {
		final Account acc=new Account();
		new Thread() {
			public void run()
			{
				acc.withdraw(15000);
			}
		}.start();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new Thread() {
			public void run()
			{
				acc.deposit(10000);
			}
		}.start();;

	}

}
