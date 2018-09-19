package com.practice.codinginterview;

import java.util.Scanner;

class Fibonacci1 {
	
	public static void main(String [] args)
	{
		System.out.println("Please enter the number of terms that need to be printed");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		
		int feb1=0;
		int feb2=1;
		int sum=0;
		
		
		for (int i=0;i<=n;i++)
		{
			sum=feb1+feb2;
			feb1=feb2;
			feb2=sum;
			
			System.out.print(feb1+" ");
		}
		
	}

}
