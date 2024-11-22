package com.java.oops.Polymorphism;

public class CompileTimePolymorphism {

	public static void method()
	{
		System.out.println("method");
	}
	
	public static void method(int a)
	{
		System.out.println("Integer method");
	}
	
	public static void method(String a)
	{
		System.out.println("String method");
	}
	
	public static void method(char a)
	{
		System.out.println("Character method");
	}
	
	public static void method(boolean a)
	{
		System.out.println("Boolean method");
	}
	
	public static void main() {
		
	}
	
	public static void main(int a) {
		
	}
	
	public static void main(String[] args) {
		
		method(2143);
	}

}
