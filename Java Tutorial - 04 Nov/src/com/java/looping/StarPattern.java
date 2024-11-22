package com.java.looping;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1; i<=5; i++)// 1 2 3 4 5
		{
			for(int j=1; j<=i; j++)// 1 2 3 4 5
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
