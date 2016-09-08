/*******************************************************************************
**
**
**              Name: Blaine Harris
**              Project: Weekly-Problems-2016-2017
**              File: Intermediate2.java
**              Date: 09/08/16
**              Language: java
**
**
**
/******************************************************************************/

import java.util.Scanner;
import java.util.Arrays;
import java.util.Objects;

public class Intermediate2
{

  public static void main (String[] args)
  {
    int sum;
    String exit = "";
    Scanner input = new Scanner(System.in);

    // Create an array of chars [a,b,...,y,z,A,B,...,Y,Z] indexes are 0-52
    char[] valArray = new char[52];
    for (int i = 97; i <= 122; i++)
    {
      valArray[i-97] = (char) i;
    }
    for (int i = 65; i <= 90; i++)
    {
      valArray[26 + (i-65)] = (char) i;
    }

    do {

      sum = 0;

      // Get user's word to evaluate and convert to char array.
      System.out.println("\n\nWhat word would you like to place a value on?");
      System.out.print(">");
      String word = input.nextLine();
      char[] wordArr = word.toCharArray();

      // Iterate through the users word, compare to the valArray and add the
      // value to sum based on the character's index in valArray.
      for (int i = 0; i < wordArr.length; i++)
      {
        for ( int j = 0; j < valArray.length; j++)
        {
          if ( wordArr[i] == valArray[j] )
          {
            sum = ( j > 25 ) ? sum + j-25 : sum + j + 1; // if uppercase (sum + j-25) , else (sum+j+1)
          }
        }
      }

      // Output the value of the word to user.
      System.out.println("The total value of your word is " + sum + "\n\n");

      System.out.println("Would you like to continue? (type 'exit' to exit or press any other key to continue)");
      exit = input.nextLine();

    } while (!exit.equals("exit"));

  }

}
