package com.std.duplicate;

import java.util.HashSet;

public class InputStudent 
{
	public HashSet<Student> getStudents()
	{
		HashSet<Student> set = new  HashSet<Student>();
		
		set.add(new Student(101, "Ashutosh"));
		set.add(new Student(102, "Rahul"));
		set.add(new Student(101, "Ashutosh"));
		set.add(new Student(103, "Amit"));
		set.add(new Student(102, "Rahul"));
		
		return set;
	}
	
	
}
