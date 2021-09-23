/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jordan Snoap
 */

package org.example.ex24;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class ex24
{
    public static void printNotAnagram(String one, String two)
    {
        System.out.println("\"" + one + "\" and \"" + two + "\" are not anagrams.");
    }

    public static void printAnagram(String one, String two)
    {
        System.out.println("\"" + one + "\" and \"" + two + "\" are anagrams.");
    }

    public static boolean isAnagram(String wordOne, String wordTwo)
    {
        char[] firstConvert, secondConvert;
        int i;

        if (wordOne.length() != wordTwo.length()) {
            return false;
        }
        else {
            // Converting strings into char arrays
            firstConvert = wordOne.toCharArray();
            secondConvert = wordTwo.toCharArray();

            // Sorting Char arrays
            Arrays.sort(firstConvert);
            Arrays.sort(secondConvert);

            for (i = 0; i < wordOne.length(); i++) {
                if (firstConvert[i] != secondConvert[i]) {
                    return false;
                }
            }

            // Print this output if program navigates through whole for loop
            return true;
        }
    }
    // Program that asks to input two strings and prints whether they are anagrams of each other.
    public static void main( String[] args ) {
        String first, second;
        boolean store;

        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");

        System.out.println("Enter the first string: ");
        Scanner inputFirst = new Scanner(System.in);
        first = inputFirst.next();

        System.out.println("Enter the second string: ");
        Scanner inputSecond = new Scanner(System.in);
        second = inputSecond.next();

        store = isAnagram(first, second);

        if(store)
        {
            printAnagram(first,second);
        }
        else
        {
            printNotAnagram(first,second);
        }


    }
}