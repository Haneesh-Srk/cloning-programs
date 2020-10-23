package com.nttdata.assignment;

public class Work2 {

	public static void main(String[] args)
	{
		Computer comp = new Computer(1000,"lenovo","grey", new MotherBoard(4),"i5");
		Laptop lap = new Laptop(2000,"dell","black", new MotherBoard(8),"i7");
		comp.display1();
		lap.display2();
	}
}
