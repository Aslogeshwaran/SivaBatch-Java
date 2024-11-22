package com.java.ExceptionDemo;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;

		int b = 10;
		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println("Can't divide by zero");
		} finally {
			System.out.println("Thanks for using our app..");
		}
	}

}
