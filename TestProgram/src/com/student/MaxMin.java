//find the maximum and minimum number in the array.

package com.student;
import java.util.Scanner;

public class MaxMin {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of test case");
		int t=sc.nextInt();
		while(t!=0)
		{
			System.out.println("Enter the size of array");
			int n=sc.nextInt();
			int a[]=new int[n];
			System.out.println("Enter the element of array");
			for(int i=0; i<a.length; i++)
			{
				
				a[i]=sc.nextInt();
			}
			int l=a.length;
			int max=a[0]; int min=a[0];
			for(int i=0; i<l; i++)
			{
				
				if(a[i]>max)
					max=a[i];
				if(a[i]<min)
					min=a[i];
			}
			System.out.print(max+" "+min);
			
			t--;
		}
	}

}
