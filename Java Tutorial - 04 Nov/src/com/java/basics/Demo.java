package com.java.basics;

public class Demo {
	
	static int a=10;//static
	
	int b=20;//instance

	public static void m1()
	{
		int a=1;
		int b=2;
		System.out.println(Demo.a);
		System.out.println(new Demo().b);
		System.out.println(a);
		System.out.println(b);
	}
	
	public void m2()
	{
		int a=3;
		int b=4;
		System.out.println(Demo.a);
		System.out.println(this.b);
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo.m1();
		
		new Demo().m2();
	}

}
