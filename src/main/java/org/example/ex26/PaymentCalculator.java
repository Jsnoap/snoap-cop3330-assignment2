/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jordan Snoap
 */

package org.example.ex26;

public class PaymentCalculator
{
    final double bal;
    final double apr;
    final double monthly;
    // Constructor
    public PaymentCalculator(double bal, double apr, double monthly)
    {
        this.bal = bal;
        this.apr = apr;
        this.monthly = monthly;
    }

    // Calculates the necessary months value to pay off card.
    public double calculateMonthsUntilPaidOff()
    {
        double numMonths;
        double dailyRate = apr / 36500;

        numMonths = -(1.0/30.0) * Math.log(1 + bal / monthly * (1 - Math.pow((1 + dailyRate),30))) / Math.log(1 + dailyRate);

        numMonths = Math.ceil(numMonths);

        printStatement(numMonths);

        return numMonths;
    }

    // Prints the finishing statement
    public static void printStatement(double months)
    {
        System.out.println("It will take you " + String.format("%.0f",months) + " months to pay off this card.");
    }
}

