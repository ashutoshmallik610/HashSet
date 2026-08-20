package com.students;

public class Student 
{
	private int id;
	private String name;
	private int age;
	
	public Student(int id,String name,int age)
	{
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode()
	{
	return this.name.hashCode();
	}
	@Override
	public boolean equals(Object obj)
	{
		Student std = (Student) obj;
		
		return this.name.equals(std.name) & this.id == std.id & this.age == std.age;
	}
	public void display()
	{
		System.out.println("Id : "+id+" Name : "+name+" Age : "+age);
	}
}
