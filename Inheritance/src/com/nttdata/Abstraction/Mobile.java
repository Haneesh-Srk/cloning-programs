package com.nttdata.Abstraction;

public class Mobile implements ElectronicDevice {

	String color;
	Processor processor;
	String mname;
	
	public Mobile(String color, Processor processor, String mname ) {
		super();
		this.color=color;
		this.processor=processor;
		this.mname=mname;
	}
	
	public void startDevice(ElectronicDevice e)
	{
		Mobile m1 = (Mobile)e;
		System.out.println(m1.mname+" Mobile started ");
		
	}
	
	public void stopDevice(ElectronicDevice e)
	{
		Mobile m2 = (Mobile)e;
		System.out.println(m2.mname+" Mobile stopped ");
	}
	
	void displayMobileDetails()
	{
		System.out.println("Mobile details are ");
		System.out.println("Color is :"+color);
		System.out.println("Processor details of memory is:"+processor.memory.memorySize);
		System.out.println("Processor model is :"+processor.model);
	}
}
