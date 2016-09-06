/*
 * 	@file:		Main.java
 * 	@Author:	Austin Bailey
 * 	@Date:		9.4.2016
 */

import java.util.Scanner;//for user input
public class Main 
{
	public static void main(String[] args)
	{
		Scanner myScanner = new Scanner(System.in);//creates a new instance of Scanner
		System.out.println("What is your favorite color?");//simple println
		String s = myScanner.next();//returns the string given by the user and places it in the string s
		System.out.println("That's a great color! Mine's red.");
		myScanner.close();//closes myScanner
	}
}
