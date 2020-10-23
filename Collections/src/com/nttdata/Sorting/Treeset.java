package com.nttdata.Sorting;

import java.util.TreeSet;
public class Treeset {

	public static void main(String[] args) {
		
		TreeSet<Employee> set=new TreeSet<>(new SortById());
		
		set.add(new Employee(111,"srk","vijayawada"));
		set.add(new Employee(112,"haneesh","hyderabad"));
		set.add(new Employee(113,"khan","mumbai"));
		set.add(new Employee(114,"king","kolkata"));
		set.add(new Employee(115,"ram","banglore"));
		
		for (Employee employee : set) {
			System.out.println(employee);
		}
	}

}