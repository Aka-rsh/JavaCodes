package com.practice.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeMain {
   public static void main(String[] args) {
	List<Employee> li = new ArrayList<Employee>();
	li.add(new Employee(4, "Sneha", 61000.0));
	li.add(new Employee(1, "Amit", 45000.0));
	li.add(new Employee(5, "Vikram", 50000.0));
	li.add(new Employee(2, "Riya", 56000.0));
	li.add(new Employee(3, "Karan", 72000.0));
    
	Collections.sort(li);
	for(Employee e :li ) {
		System.out.println(e);
	}
   }
}
