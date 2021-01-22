/*Given a stream of numbers, print average or mean of the stream at every point.

Input: The first line of input contains an integer T denoting the number of test cases.
For each test case there will be two lines. The first line contains an integer N denoting the size of array C[], and second line contains N space seperated integers C[i].

Output:
Print the average of the stream at every point (in integer).

Example:
Input
2
5
10 20 30 40 50
2
12 2

Output
10 15 20 25 30
12 7*/

package com.student;
import java.util.Scanner;

public class MeanOrAverage {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of test case");
		int t=sc.nextInt();
		while(t!=0)
		{
			System.out.println("Enter the size of Array");
			int n=sc.nextInt();
			int a[]=new int[n];
			System.out.println("Enter the element of an Array");
			for(int i=0; i<a.length; i++)
			{
				a[i]=sc.nextInt();
			}
			int b[]=new int[n];
			b[0]=a[0];
			int temp=0;
			int l=b.length;
			
			while(temp!=1)
			{
				int d=2;
				for(int j=1; j<l; j++)
				{
					
					int p=j;
					int s=0;
					while(p>=0)
					{
						
						s=s+a[j-p];
						p--;
					}
					b[j]=s/d;
					d++;
					
				}
				for(int j=0; j<l; j++)
				{
					System.out.print(b[j]+" ");
				}
				System.out.println();
				temp++;
			}
			t--;
		}
	}

}
