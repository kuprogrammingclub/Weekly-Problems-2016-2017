/**
 * File: Beginner1.java
 * Author: Stefan Mendoza
 * Date: 2 September 2016
 *
 * Week 1 / Beginner 1 for KU Programming Club (2016-2017)
 */

import java.util.Scanner;

public class Beginner1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What's your favorite color?");
        System.out.print("> ");
        String favoriteColor = input.nextLine();

        System.out.println("Your's is " + favoriteColor + "? That's a great color! Mine's red.");
    }
}
