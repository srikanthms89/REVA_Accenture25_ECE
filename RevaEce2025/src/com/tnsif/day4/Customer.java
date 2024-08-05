package com.tnsif.day4;

public class Customer {
	
	//Data members
	
	private String name;
	private String address;
	private long phNo;
	
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
	public long getPhNo() {
		return phNo;
	}
	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + ", phNo=" + phNo + "]";
	}
	
	
	
	
	
	

}
