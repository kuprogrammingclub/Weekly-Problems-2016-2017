/*******************************************************************************
**
**
**              Name: Blaine Harris
**              Project: Weekly-Problems-2016-2017
**              File: 03_Intermediate1.java
**              Date: 09/06/16
**              Language: java
**
**
**
/******************************************************************************/

import java.util.Scanner;
import java.util.Arrays;
import java.util.Objects;

public class Intermediate1
{

  public static void main (String[] args)
  {

    Scanner input = new Scanner(System.in);
    String x = null;

    do
    {

      System.out.println("\n"); // Formatting



      System.out.println("What is your name?");
      System.out.print(">");
      String userName = input.nextLine(); //get users name



      //create new char array w/ userName.length
      char[] nameArray;
      nameArray = new char[userName.length()];



      // For char at index of username, place in opposite index of nameArray.
      // Basically creating a reverse of userName
      for (int i = userName.length() - 1; i >= 0; i--)
      {
        nameArray[i] = userName.charAt((userName.length() - 1) - i);
      }



      // Change the array to a string for output purposes
      String rev = new String(nameArray);



      System.out.println(); // Formatting



      // Compare userName as an array with nameArray. If true; Palindrome. Else; Not palindrome.
      if (Arrays.equals(userName.toCharArray(), nameArray))
      {
        System.out.println("Your name backwards is '" + rev + "', this is a palindrome.");
      }
      else
      {
        System.out.println("Your name backwards is '" + rev + "', this is not a palindrome.");
      }



      System.out.println("\n"); // Formatting



      // Ask the user if they want to continue and store answer in x
      System.out.println("Do you want to keep going? (Type 'exit' to quit or press any other key to continue)");
      x = input.nextLine();



    }while(!x.equals("exit")); // Exit if user enters "exit"
  }

}
