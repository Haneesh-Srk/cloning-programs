package com.nttdata.Sorting;

import java.util.HashSet;
public class Hashset {

	public static void main(String[] args) {
		
		HashSet<Employee> set=new HashSet<>();
		
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