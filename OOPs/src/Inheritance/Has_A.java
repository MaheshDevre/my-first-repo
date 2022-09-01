package Inheritance;

public class Has_A {

	public static void main(String[] args) {
		Engine obj=new Engine();
		Car c1=new Car(obj);
		c1.getCarProperties();
		c1.getVehicleProperties();

	}

}
