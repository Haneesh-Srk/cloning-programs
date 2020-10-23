package com.nttdata.inheritance;

public class Bus extends Vehicle {

	Engine engine;
	
	public Bus(String name, String color, int cost, Engine engine) {
		super(name, color, cost);
		
		this.engine=engine;
	}
	void display2()
	{
		System.out.println("Details of Bus are:");
		System.out.println("Name is:"+name+"\n" +"Color is:"+color+"\n" +"Cost is:"+cost+"\n" +"Engine cc is:"+engine.enginecc);
		
	}
}
