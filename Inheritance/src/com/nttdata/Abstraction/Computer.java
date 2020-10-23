package com.nttdata.Abstraction;

public class Computer implements ElectronicDevice {

	String color;
	MotherBoard motherBoard;
	int cost;
	String cname;
	
	public Computer(String color, MotherBoard motherBoard, int cost, String cname)
	{
		super();
		this.color=color;
		this.motherBoard=motherBoard;
		this.cost=cost;
		this.cname=cname;
	}
	public void startDevice(ElectronicDevice e)
	{
		Computer c1 = (Computer)e;
		System.out.println(c1.cname+" Computer started ");
		
	}
	
	public void stopDevice(ElectronicDevice e)
	{
		Computer c2 = (Computer)e;
		System.out.println(c2.cname+" Computer stopped ");
	}
	
	void displayComputerDetails()
	{
		System.out.println("Computer details are ");
		System.out.println("Color is :"+color);
		System.out.println("Processor details of memory is:"+motherBoard.ram.ramSize);
		System.out.println("Processor model is :"+motherBoard.model);
	}
}
