package com.nttdata.Assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeList {

	public static void main(String[] args) {
		
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(369,"Naruto",25000,"Chennai"));
		list.add(new Employee(123,"Asta",2000,"Hyderabad"));
		list.add(new Employee(456,"Goku",15860,"Bangalore"));
		list.add(new Employee(789,"Luffy",5000,"Chennai"));
		list.add(new Employee(741,"Deku",25000,"Bangalore"));
		list.add(new Employee(852,"Gohan",17000,"Chennai"));
		list.add(new Employee(963,"Sasuke",10000,"Bangalore"));
		list.add(new Employee(321,"Itachi",35000,"Hyderabad"));
		list.add(new Employee(654,"Uchiha",12000,"Chennai"));
		list.add(new Employee(987,"Ichigo",65214,"Bangalore"));
		list.add(new Employee(147,"Vegeta",20000,"Bangalore"));
		list.add(new Employee(258,"Kira",14586,"Hyderabad"));
		
		long c1=list.stream().filter(h->h.empLocation.equalsIgnoreCase("Chennai")).count();
		System.out.println("No of employees from Chennai are "+c1);
		long c2=list.stream().filter(h->h.empLocation.equalsIgnoreCase("Hyderabad")).count();
		System.out.println("No of employees from Hyderabad are "+c2);
		long c3=list.stream().filter(h->h.empLocation.equalsIgnoreCase("bangalore")).count();
		System.out.println("No of employees from Bangalore are "+c3);
		
		double d=list.stream().map(h->h.empSalary).reduce(0.0,(sum,sal)->(sum+sal));
		System.out.println("Sum of total employees salaries "+d);
		System.out.println("Employees with salary between 10000 and 20000");
		List<Employee> d1=list.stream().filter(h->h.empSalary>10000 && h.empSalary<20000).collect(Collectors.toList());
		d1.forEach((h)->System.out.println(h));
		d1.forEach((h)->System.out.println(h.empSalary+h.empSalary*5/100));
	}

}
