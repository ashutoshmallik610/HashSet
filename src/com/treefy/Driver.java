package com.treefy;

import java.util.HashSet;
import java.util.Set;

class Employee
{
	String id;

	public Employee(String id) {
		super();
		this.id = id;
	}

	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public boolean equals(Object obj) 
	{
		Employee emp = (Employee) obj;
		
		return this.id.equals(emp.id);
	}
	
}

public class Driver {

	public static void main(String[] args) {

		Employee emp1 = new Employee("AAAA");
		Employee emp2 = new Employee("BBBB");
		Employee emp3 = new Employee("CCCC");
		Employee emp4 = new Employee("DDDD");
		Employee emp5 = new Employee("EEEE");
		Employee emp6 = new Employee("FFFF");
		Employee emp7 = new Employee("GGGG");
		Employee emp8 = new Employee("HHHH");
		Employee emp9 = new Employee("IIII");
		Employee emp10 = new Employee("JJJJ");
		Employee emp11 = new Employee("KKKK");
//		Employee emp12 = new Employee("LLLL");
//		Employee emp13 = new Employee("MMMM");
//		Employee emp14 = new Employee("NNNN");
//		Employee emp15 = new Employee("OOOO");
		
		Set<Employee> emps = new HashSet<Employee>();
		
		emps.add(emp1);
		emps.add(emp2);
		emps.add(emp3);
		emps.add(emp4);
		emps.add(emp5);
		emps.add(emp6);
		emps.add(emp7);
		emps.add(emp8);
		emps.add(emp9);
		emps.add(emp10);
		emps.add(emp11);
//		emps.add(emp12);
//		emps.add(emp13);
//		emps.add(emp14);
//		emps.add(emp15);
		
		
		emps.remove(emp6);
		emps.remove(emp7);
		emps.remove(emp8);
		emps.remove(emp9);
		emps.remove(emp10);
		emps.remove(emp11);
		
		for(Employee e : emps)
		{
			System.out.println(e.id);
		}
		System.out.println(emps.size());
	}

}
