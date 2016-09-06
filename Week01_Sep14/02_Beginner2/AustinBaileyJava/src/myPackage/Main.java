package myPackage;

/*
 * 	@file:		Main.java
 * 	@Author:	Austin Bailey (a604b997@ku.edu)
 * 	@Date:		9.4.2016
 */

import java.util.Scanner;
import java.util.Calendar;
public class Main 
{
	public static void main(String[] args)
	{
		String s;
		int age;
		int myAge;
		Scanner myScanner = new Scanner(System.in);
		System.out.println("How old are you?\n>");	
		s=myScanner.next();
		try//checks to make sure the input is an integer
		{
			age=Integer.parseInt(s);//tries to parse the s from the string
		}
		catch(Exception e)//exits if the input is not an integer
		{
			System.out.println("Sorry, I need a number to know how old you are!");
			return;
		}
		
		
		//Determines how old I am
		Calendar cal =Calendar.getInstance();
		if(cal.get(Calendar.MONTH)<5) 
		{
			myAge=cal.get(Calendar.YEAR)-1996;
		}
		else if(cal.get(Calendar.MONTH)>5)//This code seems dead, except the date changes
		{
			myAge=cal.get(Calendar.YEAR)-1995;
		}
		else if(cal.get(Calendar.MONTH)==5 &&cal.get(Calendar.DAY_OF_MONTH)<23)
		{
			myAge=cal.get(Calendar.YEAR)-1996;
		}
		else
		{
			myAge=cal.get(Calendar.YEAR)-1995;
		}
		
		
		//prints out my response
		System.out.print("I'm " + myAge + ". ");
		if(myAge-age==1||age-myAge==1)//handles the case where we are one year apart, only says year instead of years
		{
			System.out.println("We are 1 year apart!");
		}
		if(myAge>age)
		{
			System.out.println("We are " + (myAge-age) + " years apart");
		}
		else if(myAge<age)
		{
			System.out.println("We are " + (age-myAge) + " years apart");
		}
		else
		{
			System.out.println("We are the same age!");
		}
	}
}
