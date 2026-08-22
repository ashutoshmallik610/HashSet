package com.cities;

import java.util.HashSet;
import java.util.Objects;

class City
{
	String cities;
	int id;
	String town;
	
	public City(String cities, int id, String town) {
		super();
		this.cities = cities;
		this.id = id;
		this.town=town;
	}
	
	@Override
	public int hashCode()
	{
		return Objects.hash(cities);
	}
	@Override
	public boolean equals(Object obj)
	{
		City c = (City) obj;
		return this.cities.equals(c.cities);
	}

	
}

public class Driver {

	public static void main(String[] args) {

		HashSet<City> cities = new HashSet<City>();
		
		cities.add(new City("Bangalore", 101, "Btm"));
		cities.add(new City("Delhi", 102, "LLP"));
		cities.add(new City("Bangalore",101, "ppl"));
		
		
		for(City c : cities)
		{
			System.out.println(c.cities + " , "+c.id +" , "+c.town);
		}

		//System.out.println("Mumbai : "+cities.contains(new City("Mumbai")));
	}


}
