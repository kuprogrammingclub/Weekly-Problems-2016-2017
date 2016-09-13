/*
 * 	@file:		Main.java
 * 	@Author:	Austin Bailey
 * 	@Date:		9.4.2016
 */

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner myScanner = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = myScanner.next();
		if(name.length()==0)//handles empty edge case
		{
			System.out.println("Sorry you have to provide a nonzero string to continue");
			return;
		}
		boolean isPalindrome=true;
		
		//this loop determines if the string is a palindrome
		for(int i=0;i<name.length()/2-1;i++)
		{
			if(name.charAt(i)!=name.charAt(name.length()-i-1))
			{
				isPalindrome=false;
			}
		}
		String r =reverse(name);
		if(isPalindrome)
		{
			System.out.println("Your name backwards is " + r + ", this is a palindrome.");
		}
		else
		{
			System.out.println("Your name backwards is " + r + ", this is not a palindrome.");
		}
	}
	
	public static String reverse(String myString)
	{
		char tempc;
		String reverse=new String();
		
		for(int i=0; i<myString.length();i++)
		{
			tempc=myString.charAt(i);
			reverse+=myString.charAt(myString.length()-i-1);
		}
		return reverse;
	}
}
