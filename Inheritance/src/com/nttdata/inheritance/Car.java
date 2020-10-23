package com.nttdata.inheritance;

public class Car extends Vehicle {

	Engine engine;
	public Car(String name, String color, int cost, Engine engine) {
		super(name, color, cost);
		// TODO Auto-generated constructor stub
	
		this.engine = engine;
			
		}
		void display1()
		{
			System.out.println("Details of Car are:");
			System.out.println("Name is:"+name+"\n" +"Color is:"+color+"\n" +"Cost is:"+cost+"\n" +"Engine cc is:"+engine.enginecc);
			
		}
	}

