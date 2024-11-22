package com.java.basics;

public class MethodDemo {

	public static void m1()
	{
		System.out.println(1);
		MethodDemo.m2();
		MethodDemo.m3();
		MethodDemo.m4();
		MethodDemo.m5();
	}
	
	public static void m2()
	{
		System.out.println(2);
	}
	
	public static void m3()
	{
		System.out.println(3);
	}
	
	public static void m4()
	{
		System.out.println(4);
	}
	
	public static void m5()
	{
		System.out.println(5);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodDemo.m1();
	}

}
