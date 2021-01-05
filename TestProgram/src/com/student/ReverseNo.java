package com.student;

public class ReverseNo {

	public static void main(String[] args) {
		
		int b=12345;
		int rev=0,rem;
		int a=b;
		
		while(a>0)
		{
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;
		}
		System.out.println("Reverse no of "+b+" is "+rev);

	}

}
