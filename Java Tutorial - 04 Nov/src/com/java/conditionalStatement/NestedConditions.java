package com.java.conditionalStatement;

public class NestedConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String username="6764634";
		
		String password="admin123";
		
		int count=9;
		
		if(username.equals("admin") && password.equals("admin123"))
		{
			System.out.println("Welcome");
		}
		
		else
		{
			if(count<=5)
			{
			System.err.println("Invalid Username and Password");
			}
			else
			{
				System.err.println("Blocked for half an hour");
			}
		}
		
	}

}
