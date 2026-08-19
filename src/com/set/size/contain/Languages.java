package com.set.size.contain;

import java.util.HashSet;

public class Languages {

	public HashSet<String> getLanguages()
	{
		HashSet<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("SQL");
		set.add("Java");
		set.add("Spring");
		set.add("SQL");
		set.add("HTML");
		set.add("Java");

		return set;		
		
	}
	
	
	public void languages()
	{
		Languages l = new Languages();
		HashSet<String> languages = l.getLanguages();
		
		boolean hasSpring = false;
		boolean hasPython = false;
		
		System.out.println("Languages : "+languages);	
		
		System.out.println("Size is : "+languages.size());
		
		for(String str : languages)
		{
			if(str.contains("Spring"))
			{
				hasSpring = true;
			}
			
			if(str.contains("Python"))
			{
				hasPython = true;
			}	
		}
		System.out.println("Spring contains : "+hasSpring);
		System.out.println("Python contains : "+hasPython);
		
	}
	
	
}
