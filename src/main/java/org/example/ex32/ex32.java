/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jordan Snoap
 */

package org.example.ex32;
import java.util.Scanner;

public class ex32 {

    // Program to create "Guess the Number" game with three levels of difficulty
    public static void main(String[] args)
    {
        int diff;
        char again;

        while (true)
        {
            printIntroTitle();

            // EXPLANATION: Difficulty 1: Number 1-10, Difficulty 2: Number 1-100, Difficulty 3: 1-1000
            System.out.println("Enter the difficulty level (1, 2, or 3)");
            System.out.println("1: Numbers 1-10, 2: Numbers 1-100, 3: Numbers 1-1000");
            Scanner inputDiff = new Scanner(System.in);
            diff = inputDiff.nextInt();

            guessingGame(diff);

            System.out.println("Do you wish to play again (Y/N)?");
            Scanner inputAgain = new Scanner(System.in);
            again = inputAgain.next().charAt(0);

            if (again == 'N' || again == 'n')
            {
                break;
            }
        }
    }

    public static void guessingGame(int difficulty)
    {
        // Math.random() gives value greater than or equal to zero and less than one
        double rand = Math.random();
        double store;

        if (difficulty == 1)
        {
            store = Math.floor(rand * 10) + 1;
        }
        else if (difficulty == 2)
        {
            store = Math.floor(rand * 100) + 1;
        }
        else
        {
            store = Math.floor(rand * 1000) + 1;
        }

        printGuessingLoop(store);
    }

    public static void printGuessingLoop(double valueToGuess)
    {
        double guess;
        int count = 1;

        Scanner inputGuess = new Scanner(System.in);

        printInitialQuestion();

        while (true)
        {
            if (inputGuess.hasNextDouble())
            {
                guess = inputGuess.nextDouble();

                if (guess == valueToGuess)
                {
                    break;
                }

                printIncorrect(valueToGuess, guess);
            }
            else
            {
                printNonNumeric();
            }

            inputGuess.nextLine();
            count++;
        }

        printFinished(count);
    }

    public static void printNonNumeric()
    {
        System.out.println("The value entered was not a number. Guess again:");
    }

    public static void printInitialQuestion()
    {
        System.out.println("I have my number. What's your guess?");
    }

    public static void printIncorrect(double answer, double guess)
    {
        if (answer > guess)
        {
            System.out.println("Too low. Guess again:");
        }
        else
        {
            System.out.println("Too high. Guess again:");
        }
    }

    public static void printIntroTitle()
    {
        System.out.println("Let's play Guess the Number!\n");
    }

    public static void printFinished(int attempts)
    {
        if (attempts == 1)
        {
            System.out.println("You got it in " + attempts + " guess!");
        }
        else
        {
            System.out.println("You got it in " + attempts + " guesses!");
        }
    }

}
