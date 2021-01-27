//Given an unsorted array a[] of size N, rotate it by D elements (clockwise).

package com.student;
import java.util.Scanner;

public class RotateArray {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of test case");
		int t=sc.nextInt();
		while(t!=0)
		{
			System.out.println("Enter the size of array and no. of size of rotation");
			int n=sc.nextInt();
			int d=sc.nextInt();
			int a[]=new int[n];
			System.out.println("Enter the element of array");
			for(int i=0; i<a.length; i++)
			{
				
				a[i]=sc.nextInt();
			}
			int b[]=new int[n];
			int k=0;
			for(int i=d; i<a.length; i++)
			{
				b[k]=a[i];
				k++;
			}
			int s=d;
			for(int i=0; i<d; i++)
			{
				b[n-s]=a[i];
				s--;
			}
			for(int j=0; j<b.length; j++)
			{
				System.out.print(b[j]+" ");
			}
			System.out.println();
			
			t--;
		}
	}

}
