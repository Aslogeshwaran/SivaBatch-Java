package com.java.oops.Polymorphism;

public class People {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		RBI rbi=new RBI();
		rbi.getInterestRate();
		
		RBI sbi=new SBI();
		sbi.getInterestRate();
		
		RBI iob=new IOB();
		iob.getInterestRate();
		
		RBI kvb=new KVB();
		kvb.getInterestRate();
		
		RBI axis=new Axis();
		axis.getInterestRate();
	}

}
