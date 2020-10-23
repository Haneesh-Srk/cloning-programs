package com.nttdata.Serialization;

import java.io.Serializable;

public class Employee implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	transient int a;
	static int b;
	String name;
	int age;
	public Employee(int a, int b, String name, int age) {
		super();
		this.a = a;
		this.b=b;
		this.name = name;
		this.age = age;
	}
	public void print(Employee employee) {
		System.out.println("Transient value"+a+"\t"+"static value"+b+"\t"+"String value"+name+"\t"+"age is"+age);
	}
	
	
}
