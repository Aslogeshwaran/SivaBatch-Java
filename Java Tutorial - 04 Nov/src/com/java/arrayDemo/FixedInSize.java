package com.java.arrayDemo;

public class FixedInSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {1,2,3,4,5,6};
		
		int b=10;
		
		int similiarDatatypes[]= {1,2,3,4,5};
		
		System.out.println(a);
		
		
		Object AllDataTypes[]= {1,2,3,4,5,5,5,5,5,5,5,1235.253F,'s',true,null,null,null,null,"java",23874672347L};
		
		for(Object aa:AllDataTypes)
		{
			System.out.println(aa);
		}
		
		
	}

}
