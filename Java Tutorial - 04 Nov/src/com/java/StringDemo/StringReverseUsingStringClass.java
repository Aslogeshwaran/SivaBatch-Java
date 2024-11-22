package com.java.StringDemo;

public class StringReverseUsingStringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="sivaraman";
		
		int stringSize=name.length()-1;
		
		System.out.print("This is Given String Value      :: ");
		for(int i=0; i<=stringSize;i++)
		{
			System.out.print(name.charAt(i));
		}
		System.out.println();
		System.out.println("=============================");
		
		System.out.print("This is Reverse of String Value :: ");
		for(int i=stringSize; i>=0;i--)
		{
			System.out.print(name.charAt(i));
		}
		System.out.println();
	}

}
