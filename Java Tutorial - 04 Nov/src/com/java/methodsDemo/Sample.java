package com.java.methodsDemo;

public class Sample {


	public static void add()
	{
		int a=1;
		
		int b=2;
		
		System.out.println(a+b);
	}
	
	public static void add(int a,int b)
	{
		
		System.out.println(a+b);
	}
	
	public static int add(int a,int b,int c)
	{
		return a+b+c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		add();
		add();
		add();
		add();
		
		add(200, 300);
		
		add(223400, 302340);
		
		add(200234, 4234300);
		
		add(223400, 302340);
		
		add(202430, 323400);
		
		int data=add(200, 300,400);
		
		System.out.println(data);
		
	}

}
