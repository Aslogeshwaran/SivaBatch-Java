package com.java.arrayDemo;

public class Sample {

	public static void main(String []args) {
		// TODO Auto-generated method stub
		

		
//		int i[];
//		
//		int []n;
//		
//		int[] t;
//
//		int a=10;
//		
		int b[]= {10,20,30,40,50,60,70,80,90,100,110};
		
		int arraySize=b.length-1;
		
		System.out.println(arraySize);
		
		for(int i=0; i<=arraySize;i++)
		{
			System.out.println(b[i]);
		}
		
		System.out.println("========================");
		
		for(int i=arraySize; i>=0;i--)
		{
			System.out.println(b[i]);
		}
		
		System.out.println("===============================");
		
		for(int bb:b)
		{
			System.out.println(bb);
		}
	}

}
