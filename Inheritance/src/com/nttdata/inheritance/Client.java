package com.nttdata.inheritance;

public class Client
{
	public static void main(String[] args)
	{
		Bus b = new Bus("Volvo","white",10, new Engine("130cc"));
		Car c = new Car("Hyundai","Blue",30, new Engine("160cc"));
		b.display2();
		System.out.println("------------------------");
		c.display1();
	}
	

}
