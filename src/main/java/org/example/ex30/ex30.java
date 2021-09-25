/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jordan Snoap
 */

package org.example.ex30;

public class ex30 {

    public static void main(String[] args)
    {
        formMultTable();
    }

    public static int formMultTable()
    {
        int i, j;
        int storeLast = 0;

        for(i = 1; i <= 12; i++)
        {
            printNum(i);

            for (j = 2; j <= 12; j++)
            {
                printNum(i * j);
                storeLast = i * j;
            }
            // Prints new line after 12 j's
            System.out.print("\n");
        }

        return storeLast;
    }

    public static void printNum(int num)
    {
        // "System.out.format" prints out statement with the necessary size
        System.out.format("%4d", num);
    }
}