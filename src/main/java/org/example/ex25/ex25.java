/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jordan Snoap
 */

package org.example.ex25;
import java.util.Scanner;
import java.lang.*;

/**
 * Hello world!
 *
 */
public class ex25
{
    // Prints proper response with flag variable supplied
    public static void printValidity(String pass, int flag)
    {
        if (flag == 1)
        {
            System.out.println("The password '"+ pass + "' is a very weak password.");
        }
        else if (flag == 2)
        {
            System.out.println("The password '"+ pass + "' is a weak password.");
        }
        else if (flag == 3)
        {
            System.out.println("The password '"+ pass + "' is a strong password.");
        }
        else if (flag == 4)
        {
            System.out.println("The password '"+ pass + "' is a very strong password.");
        }
        else
        {
            System.out.println("This password cannot properly be evaluated by our criteria");
        }
    }

    // function to check validity of password
    // With the criteria provided, there are some passwords that cannot be evaluated
    public static int passwordValidator(String pass)
    {
        char [] passwordArr;
        int i, type;

        // Convert password to char array
        passwordArr = pass.toCharArray();

        if (pass.length() < 8)
        {
            boolean digit = false, alpha = false;

            for (i = 0; i < pass.length(); i++)
            {
                if (Character.isDigit(passwordArr[i]))
                {
                    digit = true;
                    break;
                }
            }

            // Checking if there is an alphabetic char
            for (i = 0; i < pass.length(); i++)
            {
                if (Character.isAlphabetic(passwordArr[i]))
                {
                    alpha = true;
                    break;
                }
            }

            if (digit && !alpha)
            {
                type = 1;
                printValidity(pass, type);
                return type;
            }
            else if (!digit)
            {
                type = 2;
                printValidity(pass, type);
                return type;
            }
            else
            {
                type = -1;
                printValidity(pass, type);
                return type;
            }
        }
        else
        {
            boolean digit = false, alpha = false, special = false;

            // Checking if there is a digit
            for (i = 0; i < pass.length(); i++)
            {
                if (Character.isDigit(passwordArr[i]))
                {
                    digit = true;
                    break;
                }
            }

            // Checking if there is an alphabetic char
            for (i = 0; i < pass.length(); i++)
            {
                if (Character.isAlphabetic(passwordArr[i]))
                {
                    alpha = true;
                    break;
                }
            }

            // Checking if there is a special char
            for (i = 0; i < pass.length(); i++)
            {
                // Checks if not num or not alpha so we can assume its special
                if (!Character.isDigit(passwordArr[i]) && !Character.isAlphabetic(passwordArr[i]))
                {
                    special = true;
                    break;
                }
            }

            if (digit && alpha && !special)
            {
                type = 3;
                printValidity(pass, type);
                return type;
            }
            else if (digit && alpha)
            {
                type = 4;
                printValidity(pass, type);
                return type;
            }
            // Catches passwords longer than 8 characters but do not use all three of alphabetic, numeric, and special characters
            else
            {
                type = -1;
                printValidity(pass, type);
                return type;
            }
        }

    }


    // Program asks user to enter a password and returns the strength of the password
    public static void main( String[] args )
    {
        String password;

        System.out.println("Please enter a password: ");
        Scanner inputPass = new Scanner(System.in);
        password = inputPass.next();

        passwordValidator(password);
    }
}
