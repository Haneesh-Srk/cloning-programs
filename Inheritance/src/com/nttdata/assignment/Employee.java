package com.nttdata.assignment;

public class Employee extends User {

	String empdepartment;
	
	public Employee(int empid, String empname, String empadd, int empsal, String empdepartment) {
		super(empid, empname, empadd, empsal);
		this.empdepartment=empdepartment;
	}
	
	void display()
	{
		System.out.println("Employee details are");
		System.out.println("Employee id is:"+empid);
		System.out.println("Employee name is:"+empname);
		System.out.println("Employee address is:"+empadd);
		System.out.println("Employee salary is:"+empsal);
		System.out.println("Employee department is:"+empdepartment);
	}

}
