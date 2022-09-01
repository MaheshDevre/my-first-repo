package Inheritance;

public class Car extends Vehicle {
	Engine ref;
	Car(Engine obj)
	{
		ref=obj;
	}
	public void getCarProperties()
	{
		System.out.println(" CarProperties ");
		ref.getEngineProperties();
	}

}
