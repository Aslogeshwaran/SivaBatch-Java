package com.java.oops.encapsulation;

public class Sample {

	
	private int bankBalance;
	
	public void bankBalance(int bankBalance)
	{
		this.bankBalance=bankBalance;
	}
	
	public int bankBalance()
	{
		return bankBalance;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new Sample().bankBalance);
	}

}



