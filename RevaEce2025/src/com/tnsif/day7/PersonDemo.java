package com.tnsif.day7;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {

		//Person p = new Person(); //Default constructor invoked
		//System.out.println(p);
		
		//parameterized constructor is invoked
		//Person p1 = new Person("kumar","Bangalore",9008401136l);
		//System.out.println(p1);
		
		//Scanner class
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the person details");
		String name,address;
		long mob;
	     name = sc.nextLine();
	     address = sc.nextLine();
	     mob = sc.nextLong();
	     
	     Person p3 = new Person();
	     p3.setName(name);
	     p3.setAddress(address);
	     p3.setMob(mob);
	 	System.out.println(p3);
	}

}
