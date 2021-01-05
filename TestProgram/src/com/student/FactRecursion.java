package com.student;

import java.util.Scanner;

public class FactRecursion {
		static int fact=1;
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number for find out factorial");
		int a=sc.nextInt();
		
		FactRecursion f=new FactRecursion();
		f.calResult(a);
		System.out.println("factorial of "+a+ " is "+fact);
		}
	void calResult(int rr)
	{
		if(rr!=0)
		{
		fact=fact*rr;
		calResult(rr-1);
		}
	}

}
