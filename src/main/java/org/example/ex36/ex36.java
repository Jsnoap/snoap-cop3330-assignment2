/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jordan Snoap
 */

package org.example.ex36;
import java.util.Scanner;
import java.util.ArrayList;

public class ex36 {

    // Program to compute average, max, min, and std based on user entered values
    public static void main(String[] args)
    {
        double avg, max, min, std;
        ArrayList<Double> values = new ArrayList<>();
        enterNumbersAndStore(values);

        avg = average(values);
        printAvg(avg);

        min = min(values);
        printMin(min);

        max = max(values);
        printMax(max);

        std = std(values);
        printStd(std);
    }

    // Numbers can be entered until user inputs "done."
    public static void enterNumbersAndStore(ArrayList<Double> numbers)
    {
        Scanner inputNum = new Scanner(System.in);
        double num;
        String done;

        while (true)
        {
            printQuestion();
            // Stop the infinite loop if user enters a blank message
            if (inputNum.hasNextDouble())
            {
                num = inputNum.nextDouble();
                numbers.add(num);
            }
            else
            {
                if (inputNum.hasNext())
                {
                    done = inputNum.next();

                    if (done.equals("done"))
                    {
                       break;
                    }
                }
                else
                {
                    inputNum.nextLine();
                }
                printInvalidEntry();
            }
        }
    }

    public static void printQuestion()
    {
        System.out.println("Enter a number (If done type \"done\"):");
    }

    public static void printInvalidEntry()
    {
        System.out.println("Please enter a valid numerical value");
    }


    public static double average(ArrayList<Double> numsEntered)
    {
        int i;
        double total = 0;

        for (i = 0; i < numsEntered.size(); i++)
        {
            total += numsEntered.get(i);
        }

        return total / numsEntered.size();
    }

    public static void printAvg(double average)
    {
        System.out.println("The average is " + average);
    }

    public static double min(ArrayList<Double> numsEntered)
    {
        int i;
        double min = numsEntered.get(0);

        for (i = 1; i < numsEntered.size(); i++)
        {
            if (numsEntered.get(i) < min)
            {
                min = numsEntered.get(i);
            }
        }

        return min;
    }

    public static void printMin(double minimum)
    {
        System.out.println("The minimum is "+ minimum);
    }

    public static double max(ArrayList<Double> numsEntered)
    {
        int i;
        double max = numsEntered.get(0);

        for (i = 1; i < numsEntered.size(); i++)
        {
            if (numsEntered.get(i) > max)
            {
                max = numsEntered.get(i);
            }
        }

        return max;
    }

    public static void printMax(double maximum)
    {
        System.out.println("The maximum is " + maximum);
    }

    public static double std(ArrayList<Double> numsEntered)
    {
        int i;
        double avg = average(numsEntered);
        double total = 0;

        for(i = 0; i < numsEntered.size(); i++)
        {
            total = total + Math.pow((numsEntered.get(i) - avg), 2);
        }
        return Math.sqrt(total / numsEntered.size());
    }

    public static void printStd(double stdev)
    {
        System.out.println("The standard deviation is " + String.format("%.2f",stdev));
    }
}