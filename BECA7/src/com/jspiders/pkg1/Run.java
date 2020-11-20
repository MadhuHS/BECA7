package com.jspiders.pkg1;

public class Run 
{
	public static void main(String[] args) 
	{
		System.out.println("Program starts...");
        
		Sample s1 = new Sample();
		System.out.println(s1.v1);
		s1.view();
		
		System.out.println(s1.v2);
		s1.view2();
		
		System.out.println(s1.v3);
		s1.view3();
		
		System.out.println("Program ends...");
	}
}
