package com.java.oops.encapsulation;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sample sample = new Sample();

		//System.out.println(Sample.bankBalance);
		sample.bankBalance(178514);
		
		System.out.println(sample.bankBalance());
		
		Encap encap=new Encap();
		
		encap.setEmpID("INFO001");
		
		encap.setEmpName("Admin");
		
		System.out.println(encap.getEmpID());
		
		System.out.println(encap.getEmpName());
		
	}

}
