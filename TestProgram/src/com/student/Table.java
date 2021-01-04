package com.student;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// Print Table of any number
		String que;
		do {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. you want to print table");
		int t=sc.nextInt();
		for(int i=1; i<=10; i++)
		{
			System.out.println(t+"*"+i+"="+t*i);	
		}
		System.out.println("\n");
		System.out.println("Do you want to print any other table(for yes press y and for no press n)");
		que=sc.next();
		}
		while(que.equalsIgnoreCase("y"));
		

	}

}
