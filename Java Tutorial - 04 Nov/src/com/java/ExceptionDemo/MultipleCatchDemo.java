package com.java.ExceptionDemo;

public class MultipleCatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,5};//index
		
		int b=0;
		
		try {
		System.out.println(a[7]/b);
		}
		
		catch(ArithmeticException e)
		{
			System.err.println("Error...");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.err.println("Please Check array length");
		}
		catch(Exception e)
		{
			System.err.println("Undefined exception");
		}
	}

}
