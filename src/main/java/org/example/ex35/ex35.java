/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jordan Snoap
 */

package org.example.ex35;
import java.util.Scanner;
import java.util.ArrayList;

public class ex35 {

    // Program to pick a winner after prompting user to input some names.
    // Stop picking names when user enters a blank
    public static void main(String[] args)
    {
        String winner;

        ArrayList<String> possibleWinners = new ArrayList<>();
        namesInputAndStored(possibleWinners);

        winner = pickWinner(possibleWinners);

        printWinner(winner);
    }

    public static void namesInputAndStored(ArrayList<String> participants)
    {
        Scanner inputRate = new Scanner(System.in);
        printQuestion();
        String name;

        while (true)
        {
            name = inputRate.nextLine();

            // Stop the infinite loop if user enters a blank message
            if (name.equals(""))
            {
                break;
            }

            participants.add(name);
            printQuestion();
        }
    }

    public static void printQuestion()
    {
        System.out.println("Enter a name:");
    }

    // Creates a random number between 0 and the size of the ArrayList (this is the index)
    public static String pickWinner(ArrayList<String> people)
    {
        // This is typecasting (Learned in CS1)
        int rand = (int)Math.floor(Math.random()*(people.size()));

        return people.get(rand);
    }

    public static void printWinner(String champion)
    {
        System.out.println("The winner is... " + champion + ".");
    }
}
