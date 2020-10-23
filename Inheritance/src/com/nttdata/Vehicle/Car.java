package com.nttdata.Vehicle;

public class Car extends Details implements Vehicle {

	Engine engine;
	String vehicleName;
	public Car(int cost, String color, String mileage, int gears, Engine engine, String vehicleName)
	{
		super(cost, color, mileage, gears);
		this.vehicleName=vehicleName;
		this.engine=engine;
	}
	public void startVehicle(Vehicle v)
	{
		Car c1 = (Car)v;
		System.out.println(c1.vehicleName+" car started");
	}
	public void stopVehicle(Vehicle v)
	{
		Car c1 = (Car)v;
		System.out.println(c1.vehicleName+" car stopped");
	}
	void displayCar()
	{
		System.out.println("Car details are");
		System.out.println("Cost is "+cost);
		System.out.println("Color is "+color);
		System.out.println("Mileage is "+mileage);
		System.out.println("NO of gears is "+gears);
		System.out.println("Engine model is "+engine.engineModel);
		System.out.println("Enginecc is "+engine.enginecc);
	}
}
