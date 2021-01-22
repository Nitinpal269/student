//Reverse an array

package com.student;
import java.util.Scanner;

public class ReverseArray {
	
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
			int b[]=new int[n];
			int p=0;
			for(int i=l-1; i>=0; i--)
			{
				b[p]=a[i];
				p++;
			}
			for(int j=0; j<b.length; j++)
			{
				System.out.print(b[j]+" ");
			}
			t--;
		}
	}

}
