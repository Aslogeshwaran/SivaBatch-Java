package com.java.basics;

public class ObjectDemo {
	
	public void m1()
	{
		System.out.println("m1");
	}
	
	public void m2()
	{
		System.out.println("m2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new ObjectDemo();//nameless Object
		
		ObjectDemo objectDemo=new ObjectDemo();

		objectDemo.m1();
		
		objectDemo.m2();
	}

}
