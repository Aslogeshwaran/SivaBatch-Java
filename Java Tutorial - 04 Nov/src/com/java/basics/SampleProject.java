package com.java.basics;

public class SampleProject {

	public void m1()
	{
		System.out.println("m1");
		SampleProject.m4();
	}
	
	public void m2()
	{
		System.out.println("m2");
	}
	
	public static void m3()
	{
		System.out.println("m3");
		new SampleProject().m2();
	}
	
	public static void m4()
	{
		System.out.println("m4");
	}
	
	static
	{
		System.out.println("static block");
	}
	
	{
		System.out.println("Instance Block");
	}
	
	public SampleProject() {
		System.out.println("Constructor");
	}
	
	public static void main(String[] args) {
		
		new SampleProject().m1();
		
		SampleProject.m3();

	}

}
