package com.niit.rtt.myrest;

public class Country {
	int id;
	String CountryName;
	long population;
	
	
	public Country(int id, String countryName, long population) {
		
		this.id = id;
		this.CountryName = countryName;
		this.population = population;
	}
	public Country() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCountryName() {
		return CountryName;
	}
	public void setCountryName(String countryName) {
		CountryName = countryName;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
	
}
