/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jordan Snoap
 */

package org.example.ex26;
import java.util.Scanner;

/**
 * Hello world!
 *
 */

public class ex26
{
    // Program designed to calculate months it takes to pay off a credit card
    // Prompts user for the balance of a credit card, the APR of the card, and their monthly payment.
    // n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
    public static void main( String[] args )
    {
        double apr, balance, monthlyPay;

        Scanner inputBalance = new Scanner(System.in);
        System.out.println("What is your balance?");
        balance = inputBalance.nextDouble();


        Scanner inputAPR = new Scanner(System.in);
        System.out.println("What is the APR on the card (as a percent)?");
        apr = inputAPR.nextDouble();

        Scanner inputMonthly = new Scanner(System.in);
        System.out.println("What is the monthly payment you can make?");
        monthlyPay = inputMonthly.nextDouble();

        PaymentCalculator calc = new PaymentCalculator(balance, apr, monthlyPay);
        calc.calculateMonthsUntilPaidOff();
    }
}
