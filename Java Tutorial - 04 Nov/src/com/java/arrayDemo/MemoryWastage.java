package com.java.arrayDemo;

public class MemoryWastage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int b[]= {1,2,3,4,5};
		
		int data[]=new int[1000];
		
		data[0]=1;
		
		data[1]=2;
		
		System.out.println(data.length);
		
		for (int i : data) {
			System.out.println(i);
		}
	}

}
