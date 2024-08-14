package com.tnsif.day7;

public class Person {
	
	private String name;
	private String address;
	private long mob;
	//Default constructor
	public Person() {
	
		 System.out.println("Default constructor");
	}
	//Parameterized constructor
	public Person(String name, String address, long mob) {
		System.out.println("Parameterized constructor");
		this.name = name;
		this.address = address;
		this.mob = mob;
	}
	//Getter and setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMob() {
		return mob;
	}
	public void setMob(long mob) {
		this.mob = mob;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", mob=" + mob + "]";
	}
	
	
	
	
	
	

}
