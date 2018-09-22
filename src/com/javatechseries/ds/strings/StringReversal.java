package com.javatechseries.ds.strings;

import java.util.Scanner;

public class StringReversal {
	
	public static void main(String[] args)
	{
		System.out.println("Please enter the string that need to be reversed: ");
		Scanner scanner = new Scanner(System.in);
		
		String originalString = scanner.next();
		scanner.close();
		
		reverseString(originalString);
		
		StringBuilder stringOne = new StringBuilder(originalString).reverse();
		
		String outputString = stringOne.toString();
		
		System.out.println("String after reversal is: "+ outputString);
		
		//System.out.println("String after reversal is: "+reversedString);
	}
	
	private static  void reverseString(String inputString)
	{
		char[] stringChars = inputString.toCharArray();
		
		for (int i=stringChars.length-1;i>=0;i--)
		{
			System.out.print(stringChars[i]);
		}
	}

}
