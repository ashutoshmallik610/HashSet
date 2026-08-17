package com.std.duplicate;

import java.util.HashSet;

public class Driver {

	public static void main(String[] args) {

		InputStudent ip = new InputStudent();
		
		HashSet<Student> std = ip.getStudents();
		
		for(Student s : std)
		{
			s.display();
		}

		
	}

}
