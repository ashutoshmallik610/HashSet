package com.numberss;

import java.util.HashSet;

class Numbers
{
	int nums;

	public Numbers(int nums) {
		super();
		this.nums = nums;
	}
	
	@Override
	public int hashCode()
	{
		return this.nums;
	}
	@Override
	public boolean equals(Object obj)
	{
		Numbers n = (Numbers) obj;
		
		return this.nums == n.nums;
	}

	
}

public class Driver {

	public static void main(String[] args) {

		HashSet<Numbers> ns = new HashSet<Numbers>();
		
		ns.add(new Numbers(10));
		ns.add(new Numbers(20));
		ns.add(new Numbers(30));
		ns.add(new Numbers(40));
		ns.add(new Numbers(50));
		ns.add(new Numbers(60));
		ns.add(new Numbers(60));
		
		
		
		for(Numbers n : ns)
		{
			System.out.println(n.nums);
		}

		System.out.println("20 : "+ns.contains(new Numbers(10)));
	}


}

