package com.java.basics;

public class Sample{
	
	
	public void m1()
	{
		System.out.println(1);
	}
	
	public static void m2()
	{
		System.out.println(2);
	}
	
	public void m3()
	{
		System.out.println(3);
	}
	
	public static void m4()
	{
		System.out.println(4);
	}
	
	public void m5()
	{
		System.out.println(5);
	}
	
	//To intialize the global variable
	{
		System.out.println("Instance Block");
	}
	public Sample() {
		System.out.println("Constructor");
	}
	public static void main(String[] args){

		new Sample();
		
	}
	
	static
	{
		System.out.println("Hi");
	}

}
