package com.java.Task;

public class ArrayReSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,5,6};
		
		int b=10;
		
		int c[]=new int[a.length+1];
		
		int i;
		
		for(i=0; i<a.length;i++)
		{
				c[i]=a[i];
	
		}
		c[i]=b;
		
		for (int m : c) {
			System.out.println(m);
		}
	}

}
