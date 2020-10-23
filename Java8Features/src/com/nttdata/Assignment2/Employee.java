package com.nttdata.Assignment2;

public class Employee {

	int empId;
	String empName;
	double empSalary;
	String empLocation;
	public Employee(int empId, String empName, double empSalary, String empLocation) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empLocation = empLocation;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empLocation="
				+ empLocation + "]";
	}
	
	
}
