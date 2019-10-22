package com.hcl.streams;

import java.util.ArrayList;
import java.util.List;

public class CountDemo3 {

	public static void main(String[] args) {
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(10,"Apple",1010f,'E'));
		list.add(new Employee(20,"Banana",2020f,'M'));
		list.add(new Employee(30,"Carrot",3030f,'M'));
		list.add(new Employee(40,"Dates",4040f,'C'));
		list.add(new Employee(50,"Apricot",5050f,'M'));
		
		Long NoOfRecords=list.stream().count();
		System.out.println("No Of Records : "+NoOfRecords);
		 
		Long empSalGt3000=list.stream().filter((var)->var.getSalary()>3000).count();
		System.out.println("Salary Greater than 3000 : "+empSalGt3000);
			
	}
}
