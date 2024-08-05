package com.tnsif.day3;

public class TypeConversionDemo {

	public static void main(String[] args) {


		//Implicit Type Conversion
		
		int a=10;
		
		float b = a;
		System.out.println(b);
		
		float  f = 10.098f;
		double d = f;
		System.out.println(d);
		
		
		// explicit type conversion
		
		double dd = 9999.7896867d;
		int aa = (int )dd;
		System.out.println(aa);
		
	}

}
