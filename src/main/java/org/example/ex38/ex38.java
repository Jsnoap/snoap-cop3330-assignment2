/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jordan Snoap
 */

package org.example.ex38;
import java.util.Scanner;

public class ex38 {

    // Program to take numbers separated by spaces and then returns the even numbers in a print statement
    // NOTE: This program ONLY works with single digit numbers. I can only think of using ".split" to avoid this issue but I believe that is restricted by the constraints.
    public static void main(String[] args)
    {
        String numsEntered;
        char[] numsArray;
        char[] evensArray;

        System.out.println("Enter a list of numbers, separated by spaces:");
        Scanner inputNums = new Scanner(System.in);
        numsEntered = inputNums.nextLine();

        numsArray = createArrayAndRemoveSpaces(numsEntered);

        evensArray = filterEvenNumbers(numsArray);

        printEvens(evensArray);
    }

    public static char[] createArrayAndRemoveSpaces(String numsList)
    {
        int i,j = 0;
        char[] stringToArray;
        char[] numsSpacesRemoved = new char[numsList.length()];
        char[] numsFixedLen;

        // Makes String a char array
        stringToArray = numsList.toCharArray();

        for (i = 0; i < stringToArray.length; i++)
        {
            if (Character.isDigit(stringToArray[i]))
            {
                numsSpacesRemoved[j] = stringToArray[i];
                j++;
            }
        }

        // Creates correct size
        numsFixedLen = new char[j];

        for (i = 0; i < numsFixedLen.length; i++)
        {
            numsFixedLen[i] = numsSpacesRemoved[i];
        }

        return numsFixedLen;
    }

    public static char[] filterEvenNumbers(char[] allNums)
    {
        int i, index = 0;
        char[] evensBadLen = new char[allNums.length];
        char[] evens;

        for (i = 0; i < allNums.length; i++)
        {
            if (allNums[i] % 2 == 0)
            {
                evensBadLen[index] = allNums[i];
                index++;
            }
        }

        evens = new char[index];

        for (i = 0; i < index; i++)
        {
            evens[i] = evensBadLen[i];
        }

        return evens;
    }

    public static void printEvens(char[] allEvens)
    {
        int i;
        String output = "";

        for (i = 0; i < allEvens.length; i++)
        {
            if (i == allEvens.length - 1)
            {
                output += " " + allEvens[i] + ".";
            }
            else
            {
                output += " " + allEvens[i];
            }
        }

        System.out.println("The even numbers are" + output);
    }
}