package com.explicitly.hashcollision;

import java.util.HashSet;

class Employee
{
	private String name;

	public Employee(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public int hashCode()
	{
		return 1234;
	}
	
}

public class Driver 
{
	public static void main(String[] args) 
	{
		HashSet<Employee> employees = new HashSet<Employee>();
		
		Employee emp1 = new Employee("Rahul");
		Employee emp2 = new Employee("Rahul");
		Employee emp3 = new Employee("Rahul");
		Employee emp4 = new Employee("Rahul");
		Employee emp5 = new Employee("Rahul");
		Employee emp6 = new Employee("Rahul");
		Employee emp7 = new Employee("Rahul");
		Employee emp8 = new Employee("Rahul");
		Employee emp9 = new Employee("Rahul");
		
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
		employees.add(emp6);
		employees.add(emp7);
		employees.add(emp8);
		employees.add(emp9); //Then it will handle by Treeify
		
		System.out.println(employees);
		
	}
}
