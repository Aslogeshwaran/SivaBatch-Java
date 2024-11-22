package com.java.arrayDemo;

public class TwoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= {
				{1,2,3,4,5,6},
				{3,4,5},
				{5,6,7,8,9,10},
				{7,8},
				{9,10,11,12,13,14,15},
				{11,12,13},
				{13,14}
				};
		
		for(int aa[]:a)
		{
			for(int bb:aa)
			{
				System.out.print(bb+",");
			}
			System.out.println();
		}
		System.out.println("=======================");
		
		int arrayRow=a.length-1;
		
		for(int i=0; i<=arrayRow; i++)
		{
			for(int j=0; j<=a[i].length-1; j++)
			{
				System.out.print(a[i][j]+",");
			}
			System.out.println();
		}
	}
	
	

}
