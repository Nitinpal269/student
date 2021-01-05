package com.student;

public class ReverseString {

	public static void main(String[] args) {
		
		String str="Deepak pal";
		String a="";
		char ch[]=str.toCharArray();
		int l=ch.length;
		for(int i=l-1; i>=0; i--)
		{
			a=a+str.charAt(i);
			//System.out.print(ch[i]);
		}
		System.out.println("Reverse string is "+a);

	}

}
