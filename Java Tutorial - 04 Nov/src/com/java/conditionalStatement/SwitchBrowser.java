package com.java.conditionalStatement;

public class SwitchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String browserName="uc";
		
		switch(browserName)
		{
		case "chrome":System.out.println("Chrome browser Launched");break;
			
		case "CHROME":System.out.println("Chrome browser Launched");break;
			
		case "Chrome":System.out.println("Chrome browser Launched");break;
			
		case "firefox":System.out.println("Firefox browser Launched");break;
			
		case "edge":System.out.println("Edge browser Launched");break;
			
		case "Opera":System.out.println("Opera browser Launched");break;
			
		case "UC":System.out.println("UC browser Launched");break;
		
		case "uc":System.out.println("UC browser Launched");break;
		
		case "Uc":System.out.println("UC browser Launched");break;
		
		case "uC":System.out.println("UC browser Launched");break;
			
		default:System.out.println("Check the Browser Name");
			
		}
	}

}
