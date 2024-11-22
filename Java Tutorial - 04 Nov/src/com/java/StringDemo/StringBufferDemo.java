package com.java.StringDemo;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		StringBuffer sb1=new StringBuffer("java");
		
		StringBuffer sb2=new StringBuffer("java");
		
		System.out.println(sb1.length());
		
		System.out.println(sb1.hashCode());
		
		System.out.println(sb2.hashCode());
		
		System.out.println(sb1.charAt(0));
		
		System.out.println(sb1.indexOf("a"));
		
		System.out.println(sb1.append(" programming"));
		
		System.out.println(sb1);
		
		System.out.println(sb1.reverse());
		
		System.out.println(sb1);
	}

}
