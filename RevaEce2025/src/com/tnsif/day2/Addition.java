package com.tnsif.day2;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {

          int firstNumber;
          int secondNumber;
          int result;
          
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the first number");
          firstNumber=sc.nextInt();
          System.out.println("Enter the second number");
          secondNumber= sc.nextInt();
          result =firstNumber + secondNumber;
          System.out.println("The result is" +result);
          
	}

}
