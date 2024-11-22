package com.java.methodsDemo;

import java.util.Scanner;

public class VoteStatus {

	
	public static void eligiblityForVote()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter your age :: ");
		int age =scan.nextInt();
		
		if(age>=18)
		{
			System.out.println("You Eligable for vote");
		}
		
		else
		{
			System.err.println("You are not eligable for vote");
			System.err.println("Wait till 18 years");
		}
	}
	
	public static void eligiblityForVote(int a)
	{
		if(a>=18)
		{
			System.out.println("You Eligable for vote");
		}
		
		else
		{
			System.err.println("You are not eligable for vote");
			System.err.println("Wait till 18 years");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		eligiblityForVote();
		
		eligiblityForVote(50);

		
		
	}

}
