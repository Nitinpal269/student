package com.student;
import java.util.Scanner;

public class Calculator {
	
	
	public static void main(String[] args) {
		
		String s;
		
		do {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first number");
		double no1=sc.nextDouble();
		System.out.println("Enter your second number");
		double no2=sc.nextDouble();
		System.out.println("Select any symbol(+,-,*,/)");
		String sym=sc.next();
		
		double result;
		switch(sym)
		{
		case "+": 
			result=no1+no2;
			System.out.println("Addition of two number is "+result);
			break;
		case "-": 
			result=no1-no2;
			System.out.println("Subtraction of two number is "+result);
			break;
		case "*": 
			result=no1*no2;
			System.out.println("Multiplicaton of two number is "+result);
			break;
		case "/":
			result=no1/no2;
			System.out.println("Division of two number is "+result);
			break;
		default : 
			System.out.println("Invalid Symbol");
		}
		System.out.println("do you want to continue (presss y for yes and n for no)");
		s=sc.next();
		}
		while(s.equalsIgnoreCase("y"));
		
			
		
		
		
		
		
		
	}

}
