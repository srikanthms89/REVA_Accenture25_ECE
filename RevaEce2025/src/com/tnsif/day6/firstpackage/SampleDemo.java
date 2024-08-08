package com.tnsif.day6.firstpackage;

public class SampleDemo {

	public static void main(String[] args) {

		Sample s = new Sample();
		s.defaultdisplay();
		System.out.println(s.publicdisplay());
		System.out.println(s.protectedisplay());
		s.a=100;
		s.defaultdisplay();

	}

}
