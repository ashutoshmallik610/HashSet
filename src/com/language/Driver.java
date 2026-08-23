package com.language;

import java.util.HashSet;

public class Driver {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<>();
		
		System.out.println(set.add("Java"));
		System.out.println(set.add("SQL"));
		System.out.println(set.add("Java"));
		System.out.println(set.add("Spring"));
		System.out.println(set.add("SQL"));
		
	}


}


