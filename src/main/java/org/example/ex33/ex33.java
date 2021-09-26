/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jordan Snoap
 */

package org.example.ex33;
import java.util.Scanner;

public class ex33 {

    // Program to simulate a Magic 8 Ball
    public static void main(String[] args)
    {
        int index;

        System.out.println("*-* Welcome to the Magic 8 Ball! *-*\nWhat's your Question");
        Scanner inputQ = new Scanner(System.in);
        inputQ.nextLine();

        index = generateRandom();

        printResponse(index);
    }

    public static int generateRandom()
    {
        double rand = Math.random();

        if (rand > 0 && rand < .25)
        {
            return 0;
        }
        else if (rand >= .25 && rand < .50)
        {
            return 1;
        }
        else if (rand >= .50 && rand < .75)
        {
            return 2;
        }
        else
        {
            return 3;
        }
    }

    public static String printResponse(int listIndex)
    {
        String [] list = {"Yes", "No", "Maybe", "Ask again later."};

        System.out.println(list[listIndex]);

        return list[listIndex];
    }

}
