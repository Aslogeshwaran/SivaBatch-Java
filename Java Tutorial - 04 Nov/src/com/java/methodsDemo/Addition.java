package com.java.methodsDemo;

public class Addition {

	public static void m1() {

	}

	public void m2() {
		m1();
	}

	public void m3() {
		m2();
	}

	public static int add() {
		int a = 10;

		int b = 20;

		return a + b;
	}

	public static int sub() {
		int a = 10;

		int b = 20;

		return b - a;
	}

	public static void main(String[] args) {

		System.out.println(add());

		System.out.println(sub());

		int mul = (add() * sub());

		System.out.println(mul);

		int add = (add() + sub());

		System.out.println(add);

		int div = (add() / sub());

		System.out.println(div);

		Addition.m1();

		new Addition().m3();

	}

}
