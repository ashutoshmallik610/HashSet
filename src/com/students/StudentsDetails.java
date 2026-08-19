package com.students;

import java.util.HashSet;

public class StudentsDetails 
{
	public HashSet<Student> getStudents()
	{
		HashSet<Student> students = new HashSet<Student>();
		
		students.add(new Student(101, "Rahul", 20));
		students.add(new Student(102, "Rahul", 20));
		students.add(new Student(101, "Rahul", 20));
		students.add(new Student(103, "Ram", 22));
		
		return students;
	}
}
