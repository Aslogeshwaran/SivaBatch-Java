package com.java.conditionalStatement;

public class IfLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String browserName="swiggy";
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.out.println("Chrome Browser Launched");
		}
		
		else if(browserName.equalsIgnoreCase("edge"))
		{
			System.out.println("Edge Browser Launched");
		}
		
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.out.println("Firefox Browser Launched");
		}
		
		else if(browserName.equalsIgnoreCase("uc"))
		{
			System.out.println("UC Browser Launched");
		}
		
		else if(browserName.equalsIgnoreCase("opera"))
		{
			System.out.println("Opera Browser Launched");
		}
		
		else
		{
			System.err.println("Please Check the browser name");
			throw new IllegalArgumentException();
		}
	}

}
