package com.students;

import java.util.*;

public class Driver {

	public static void main(String[] args) {

		StudentsDetails s = new StudentsDetails();
		HashSet<Student> student = s.getStudents();
		
		for(Student stds : student)
		{
			stds.display();
		}
         
//		LinkedHashSet li = new   LinkedHashSet();
//		li.add("Sa");
//		li.add("su");
//		li.add("s");
//		li.add("Sac");
//		li.add("suh");
//		li.add("sj");
//		
//		System.out.println("Driver.main()" + li);
	}

}
