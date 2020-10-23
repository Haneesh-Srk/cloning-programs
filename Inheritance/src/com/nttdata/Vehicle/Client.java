package com.nttdata.Vehicle;

public class Client {

	public static void main(String[] args)
	{
		Engine ce = new Engine(2004,"110cc");
		Car c = new Car(10,"black","10k",5,ce,"Hyundai");
		c.startVehicle(c);
		c.displayCar();
		c.stopVehicle(c);
		
		Engine be = new Engine(2013,"130cc");
		Workers w = new Workers("raju","shyam");
		Bus b = new Bus(50,"blue","20k",10,be,w,"volvo");
		b.startVehicle(b);
		b.displayBus();
		b.stopVehicle(b);
	}
}
