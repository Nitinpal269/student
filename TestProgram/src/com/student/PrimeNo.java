package com.student;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		 String str;
		do {
			int temp=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number for checking");
			int a=sc.nextInt();
			for(int i=2; i<a; i++) {
				if(a%i==0) {
					temp=temp+1;
						}
				
			}
			if(temp==0)
				System.out.println(a+" is prime number");
			else 
				System.out.println(a+" is not a prime number");
			
			System.out.println("Do you want check another number(y for yes n for no)");
			str=sc.next();
		}
		while(str.equalsIgnoreCase("y"));
			
			
	

	}

}
