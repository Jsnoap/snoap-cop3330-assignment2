/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jordan Snoap
 */

package org.example.ex29;
import java.util.Scanner;


public class ex29 {

    public static void main(String[] args)
    {
        double rate, years;

        rate = promptRate();

        years = calculateDoubleTime(rate);

        printStatement(years);
    }

    public static double promptRate()
    {
        double rate;

        Scanner inputRate = new Scanner(System.in);
        printQuestion();

        while (true)
        {
            if (inputRate.hasNextDouble())
            {
                rate = inputRate.nextDouble();

                if (rate > 0.0)
                {
                    break;
                }
            }

            printInvalid();
            inputRate.nextLine();
            printQuestion();
        }

        return rate;
    }

    public static double calculateDoubleTime(double rate)
    {
        return 72 / rate;
    }

    public static void printInvalid(){
        System.out.println("Sorry. That's not a valid input.");
    }

    public static void printQuestion(){
        System.out.println("What is the rate of return?");
    }

    public static void printStatement(double yearValue)
    {
        System.out.println("It will take " + yearValue + " years to double your initial investment.");
    }
}