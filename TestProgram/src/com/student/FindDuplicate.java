/*Find duplicates under given constraints

Given a sorted array having 10 elements which contains 
6 different numbers in which only 1 number is repeated five times.
Your task is to find the duplicate number using two comparisons only.

Examples:

Input: A[] = {1, 1, 1, 1, 1, 5, 7, 10, 20, 30}
Output: 1

Input: A[] = {1, 2, 3, 3, 3, 3, 3, 5, 9, 10}
Output: 3*/

package com.student;
import java.util.Scanner;

public class FindDuplicate {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of test case");
		int t=sc.nextInt();
		while(t!=0)
		{
			
			int a[]=new int[10];
			System.out.println("Enter the element of array");
			for(int i=0; i<a.length; i++)
			{
				
				a[i]=sc.nextInt();
			}
			if(a[6]==a[7])
				System.out.println(a[6]+" ");
			else if(a[4]==a[5])
				System.out.println(a[4]+" ");
			
			
			t--;
		}
	}
}
