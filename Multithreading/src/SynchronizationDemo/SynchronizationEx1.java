package SynchronizationDemo;

public class SynchronizationEx1 {

	public static void main(String[] args) {
		Display d1=new Display();
		Display d2=new Display();
		MyThread t1=new MyThread(d1,"Dhoni");
		MyThread t2=new MyThread(d2,"Yuuraj");
		t1.start();
		t2.start();
		

	}

}
