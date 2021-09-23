/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jordan Snoap
 */

package org.example.ex28;
import java.util.Scanner;

// Program that prompts user for 5 integers and returns the sum.
public class ex28 {

    public static void main ( String [] args)
    {
       int i;
       // Java-style array declaration
       int [] store = new int[5];

       for (i = 0; i < 5; i++)
       {
           System.out.println("Enter a number: ");
           Scanner storeNum = new Scanner(System.in);
           store[i] = storeNum.nextInt();
       }

       calculateSum(store);
    }

    // Calculates and returns sum
    public static int calculateSum(int [] numArr)
    {
        int i, sum = 0;

        for (i = 0; i < numArr.length; i++)
        {
            sum += numArr[i];
        }

        printSum(sum);
        return sum;
    }

    // Prints sum
    public static void printSum(int value)
    {
        System.out.println("The total is " + value + ".");
    }


}
