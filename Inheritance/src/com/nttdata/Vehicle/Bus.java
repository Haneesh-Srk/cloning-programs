package com.nttdata.Vehicle;

public class Bus extends Details implements Vehicle {

	Engine engine;
	Workers workers;
	String vehicleName;
	public Bus(int cost,String color,String mileage, int gears,Engine engine,Workers workers,String vehicleName)
	{
		super(cost,color,mileage,gears);
		this.engine=engine;
		this.workers=workers;
		this.vehicleName=vehicleName;
	}
	public void startVehicle(Vehicle v)
	{
		Bus b1 = (Bus)v;
		System.out.println(b1.vehicleName+" bus started");
	}
	public void stopVehicle(Vehicle v)
	{
		Bus b1 = (Bus)v;
		System.out.println(b1.vehicleName+" bus stopped");
	}
	void displayBus()
	{
		System.out.println("Bus details are");
		System.out.println("Cost is "+cost);
		System.out.println("Color is "+color);
		System.out.println("Mileage is "+mileage);
		System.out.println("NO of gears is "+gears);
		System.out.println("Engine model is "+engine.engineModel);
		System.out.println("Enginecc is "+engine.enginecc);
		System.out.println("Driver name is "+workers.driverName);
		System.out.println("Conducter name is "+workers.conducterName);
	}
}
