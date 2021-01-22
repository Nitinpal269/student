// find out sum and average of arral element with in 2 decimal point.

package com.student;
import java.util.Scanner;


public class SumAverage {

	public static void main(String[] args) {
		
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
	        int temp=0;
	        int l=a.length;
	        for(int i=0; i<l; i++)
	        {
	            temp=temp+a[i];
	        }
	        double avg=(double)temp/l;
	        System.out.printf(temp+" "+"%.2f",avg);
	        System.out.println();
	        t--;
	    }
		

	}

}
