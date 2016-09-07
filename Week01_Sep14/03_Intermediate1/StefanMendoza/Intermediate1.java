/**
 * File: Intermediate1.java
 * Author: Stefan Mendoza
 * Date: 7 September 2016
 *
 * Week 1 / Intermediate 1 for KU Programming Club (2016-2017)
 */

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Intermediate1 {
    /**
     * Class representing the reverse of a word and whether or not it's a palindrome
     */
    public static class Pair {
        public String reverse;
        public Boolean isPalindrome;

        Pair(String reverse, Boolean isPalindrome) {
            this.reverse = reverse;
            this.isPalindrome = isPalindrome;
        }
    }

    public static Pair isPalindrome(String name) {
        // Single letters are always palindromes
        if(name.length() == 1) {
            return new Pair(name, true);
        }

        // Double-ended queue for comparison
        Deque<Character> deque = new LinkedList<Character>();

        // Build up the reverse string
        String reverse = "";
        for(int i = name.length() - 1; i >= 0; i--) {
            char letter = name.charAt(i);
            int asciiValue = (int)letter;

            if(asciiValue < 65 || asciiValue > 90 && asciiValue < 97 || asciiValue > 122) {
                return null;
            }

            if(asciiValue > 64 && asciiValue < 91) {
                letter = (char)(asciiValue + 32);
            }

            reverse += letter;
            deque.add(letter);
        }

        // Compare letters starting at the front and back until the middle is reached with only 0 or 1 letter(s) left
        boolean valid = true;
        while(deque.size() > 1) {
            // If the current letter pair doesn't match, the word is not a palindrome
            if(deque.pollFirst() != deque.pollLast()) {
                return new Pair(reverse, false);
            }
        }

        return new Pair(reverse, true);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What's your name?");
        System.out.print("> ");
        String name = input.nextLine();

        // Don't allow an empty name as input
        if(name.length() == 0) {
            System.out.println("Whoops! You seem to have entered an empty name.");
            System.out.println("Exiting...");
            return;
        }

        Pair result = isPalindrome(name);

        if (result == null) {
            // The given name had non-alphabetical characters
            System.out.println("Whoops! You seem to have entered an invalid character.");
            System.out.println("Exiting...");
        }
        else if (result.isPalindrome) {
            System.out.println("Your name backwards is " + result.reverse + ". Your name is a palindrome!");
        }
        else {
            System.out.println("Your name backwards is " + result.reverse + ". Your name is not a palindrome.");
        }
    }
}
