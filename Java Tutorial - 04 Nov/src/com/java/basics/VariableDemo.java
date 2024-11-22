package com.java.basics;

public class VariableDemo {

	static String trainerName="logesh";//static global variable
	
	public static void batch1()
	{
		System.out.println("Trainer name :: "+VariableDemo.trainerName);
	}
	
	public static void batch2()
	{
		System.out.println("Trainer name :: "+VariableDemo.trainerName);
		
	}
	
	public static void batch3()
	{
		System.out.println("Trainer name :: "+VariableDemo.trainerName);
		
	}
	
	public static void batch4()
	{
		System.out.println("Trainer name :: "+VariableDemo.trainerName);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		
		System.out.println(a);

		VariableDemo.batch1();
		VariableDemo.batch2();
		VariableDemo.batch3();
		VariableDemo.batch4();
	}

}
