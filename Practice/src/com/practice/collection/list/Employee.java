package com.practice.collection.list;

public class Employee implements Comparable<Employee> {
   Integer id;
   String name;
   Double salaray;
   public Employee(Integer id, String name, Double salaray) {
	super();
	this.id = id;
	this.name = name;
	this.salaray = salaray;
   }
   @Override
   public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salaray=" + salaray + "]";
   }
   @Override
   public int compareTo(Employee o) {
	   Employee e = (Employee)o;
	return -1*this.id.compareTo(e.id);
   }
}
