package com.students;

import java.util.HashSet;

public class Driver {

	public static void main(String[] args) {


		StudentsDetails s = new StudentsDetails();
		HashSet<Student> student = s.getStudents();
		
		for(Student stds : student)
		{
			stds.display();
		}

	}

}
