/*******************************************************************************
**
**
**              Name: Blaine Harris
**              Project: Weekly-Problems-2016-2017
**              File: 01_Beginner1.java
**              Date: 09/06/16
**              Language: java
**
**
**
/******************************************************************************/

import java.util.Scanner;

public class Beginner2
{

  public static void main (String[] args)
  {
    //Instantiate Scanner for user input
    Scanner input = new Scanner(System.in);

    //x holds choice of user to continue or exit
    String x;

    //Loop as long as the user doesn't say to "exit"
    do
    {
      System.out.println("How old are you?");
      // age stores users' age
      String age = input.nextLine();
      //Print my age and the absolute value of my age minus the users'
      System.out.println("I'm 29. We are " + Math.abs((29 - Integer.parseInt(age))) + " years apart.");
      //Does the user want to continue?
      System.out.println("Do you want to keep going? (Type 'exit' to quit or press enter to continue)");
      x = input.nextLine();
    }while(x != "exit");
  }

}
