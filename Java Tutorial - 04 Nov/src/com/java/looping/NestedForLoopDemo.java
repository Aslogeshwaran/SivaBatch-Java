package com.java.looping;

public class NestedForLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=0;

		for(int i=1; i<=4; i++)// 1 2 3 4 
		{
			for(int j=1; j<=2; j++)// 1 2
			{
				System.out.println("Hi");
				count++;
			}
		}
		
		System.out.println(count);
	}

}
