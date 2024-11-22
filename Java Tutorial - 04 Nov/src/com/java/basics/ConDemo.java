package com.java.basics;

public class ConDemo {

	int a=10;
	
	public ConDemo() {
		this(345);
		System.out.println("No argument Constructor");
		System.out.println(this.a);
		
	}
	
	public ConDemo(int a) {
		this(345.56F);
		System.out.println("Int argument Constructor");
	}
	
	public ConDemo(float a) {
		System.out.println("Float argument Constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new ConDemo();
		
		

		
	}

}
