package com.javatechseries.ds.stack;

import java.util.Scanner;
import java.util.Stack;

public class ValidateExpression {
	
	public static void main(String[] args)
	{
		System.out.println("Please enter the expression that need to be validated: ");
		
		Scanner scanner = new Scanner(System.in);
		
		String inputExpression = scanner.next();
		
		scanner.close();
		
		if(isExpressionBalanced(inputExpression))
		{
			
			System.out.println("Expression is balanced");
		}
		else
		{
			System.out.println("Expression is not balanced");
		}
		
	}
	
	private static boolean isExpressionBalanced(String inputString)
	{
	
		Stack<Character> characterStack = new Stack<>();
		
		System.out.println("Input String is : "+inputString);
		
		for(int i=0;i<inputString.length();i++)
		{
			System.out.println("Character to be processed is : "+inputString.charAt(i) );
			if(inputString.charAt(i)=='{' || inputString.charAt(i)=='(' || inputString.charAt(i)=='[')
			{
				characterStack.push(inputString.charAt(i));
				System.out.println( inputString.charAt(i)+ "pushed to the stack");
			}
			else if (inputString.charAt(i)=='}' || inputString.charAt(i)==')' || inputString.charAt(i)==']')
			{
				if(!characterStack.isEmpty())
				{
					
					Character poppedElement=characterStack.pop();
					
					System.out.println("Value popped is: "+poppedElement);
					if( (inputString.charAt(i)=='}' && poppedElement!='{' ) || (inputString.charAt(i)==']' && poppedElement!='[') || (inputString.charAt(i)==')' && poppedElement!='('))
					{
						System.out.println("character that's popped is : "+poppedElement);
						System.out.println("characters do not match -- returning false");
						return false;
					}
				}
				else
				{
					System.out.println("Stack is empty - returning false");
					return false;
				}
				
				
				
			}
			
		}
		
		if(characterStack.isEmpty())
			return true;
		else
			return false;
		
	}

}
