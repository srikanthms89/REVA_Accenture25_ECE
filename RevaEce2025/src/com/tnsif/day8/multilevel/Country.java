package com.tnsif.day8.multilevel;

public class Country {
	
	private String name;
	private String capital;
	public Country() {
		super();
	}
	public Country(String name, String capital) {
		super();
		this.name = name;
		this.capital = capital;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	@Override
	public String toString() {
		return "Country [name=" + name + ", capital=" + capital + "]";
	}
	
	

}
