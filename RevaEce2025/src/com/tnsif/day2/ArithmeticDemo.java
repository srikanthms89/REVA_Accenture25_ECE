package com.tnsif.day2;

public class ArithmeticDemo {

	public static void main(String[] args) {

              int a = 10;
              int b= 20;
              int c= 30;
              int d= 40;
              
              a++;// 10
              
              int e = a++ + b + c + d++; //11 + 20 + 30 + 40
              
              System.out.println("value of e" + e);
              // a=12  b =  20 c = 30 d =41
              int f = --a + ++b + c + d; // a = 11 + 21 +30 + 41
              System.out.println("value of f" + f);

	}

}
