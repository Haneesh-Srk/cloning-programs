package com.nttdata.Sorting;

public class Employee {

	private int empId;
	private String empname;
	private String empAddress;
	public Employee(int empId, String empname, String empAddress) {
		super();
		this.empId = empId;
		this.empname = empname;
		this.empAddress = empAddress;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empname=" + empname
				+ ", empAddress=" + empAddress + "]";
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	
	
}
