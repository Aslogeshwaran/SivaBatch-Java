package com.java.StringDemo;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="java";
		
		String s2=new String("Java");
		
		System.out.println(s1.length());
		
		System.out.println(s1.hashCode());
		
		System.out.println(s2.hashCode());
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.equalsIgnoreCase(s2));
		
		System.out.println(s1.startsWith("se"));
		
		System.out.println(s1.contains("se"));
		
		System.out.println(s1.endsWith("va"));
		
		System.out.println(s1.indexOf("a"));
		
		System.out.println(s1.lastIndexOf("a"));
		
		System.out.println(s1.repeat(9));
		
		System.out.println(s1.charAt(3));
		
		System.out.println(s1.toLowerCase());
		
		System.out.println(s1.replace('a', 'e'));
		
		System.out.println(s1.toUpperCase());
		
		System.out.println(s1.concat(" programming"));
		
		System.out.println(s1);
	}

}
