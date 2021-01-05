package com.student;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		String str="";
		do {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find out factorial");
		int a=sc.nextInt();
		int fact=1;
		for(int i=1; i<=a; i++)
		{
			fact=fact*i;
			
		}
		System.out.println("FactoriaL of "+a+" is "+fact);
		System.out.println("do you want to continue(if y for yes n for no)");
		str=sc.next();
		}
		while(str.equalsIgnoreCase("y"));

	}

}
