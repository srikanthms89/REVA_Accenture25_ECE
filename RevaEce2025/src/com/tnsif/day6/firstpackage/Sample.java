package com.tnsif.day6.firstpackage;

public class Sample {
	
	//Default,public,private and protected data members
	
	int a = 10;
	public int b = 20;
	private int c= 30;
	protected int d =40;
	
	//Default,public,private and protected methods
	
	void defaultdisplay()
	{
		System.out.println("Default method");
		System.out.println("value is" +a);
	}
	public int publicdisplay()
	{
		System.out.println("public method");
		return b;
	}
	private int privatedisplay()
	{
		System.out.println("private method");
		return c;
	}
	
	protected int protectedisplay()
	{
		System.out.println("protected method");
		return d;
	}
	
	

}
