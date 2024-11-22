package com.java.basics;

public class Test {
	
	String name;
	
	{
		name="logesh";
		
	}

	public Test()
	{
		System.out.println("Hi");
		System.out.println("I am "+name);
	}
	
	public void m1()
	{
		System.out.println("How are you ??");
	}
	
	public void m2()
	{
		System.out.println("Where are you going ??");
	}
	
	public void m3()
	{
		System.out.println("Is this reserved Seat ??");
	}
	
	public static void m4()
	{
		System.out.println("I want to go chennai");
	}
	
	public static void main(String[] args) {
		
		new Test().m1();
		new Test().m2();
		new Test().m3();
		Test.m4();

		

	}

	
	
}
