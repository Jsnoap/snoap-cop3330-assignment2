/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jordan Snoap
 */
package org.example.ex27;
import java.util.Scanner;
import java.util.regex.Pattern;

// Program prompts user for first name, last name, employee ID, and ZIP code
// Display appropriate error messages
public class ex27 {

    static String outputStatement = "";

    public static void main( String[] args )
    {
        String firstName, lastName, id, zip;

        System.out.println("Enter the first name: ");
        Scanner inputFirst = new Scanner(System.in);
        firstName = inputFirst.nextLine();

        System.out.println("Enter the last name: ");
        Scanner inputLast = new Scanner(System.in);
        lastName = inputLast.nextLine();

        System.out.println("Enter the ZIP code: ");
        Scanner inputZip = new Scanner(System.in);
        zip = inputZip.nextLine();

        System.out.println("Enter the employee ID: ");
        Scanner inputID = new Scanner(System.in);
        id = inputID.nextLine();

        validateInput(firstName, lastName, zip, id);

    }

    public static String validateInput(String first, String last, String zipCode, String empID)
    {
        String store1, store2, store3, store4;

        store1 = validateFirstName(first);

        store2 = validateLastName(last);

        store3 = validateID(empID);

        store4 = validateZip(zipCode);

        if (store1.equals("Valid") && store2.equals("Valid") && store3.equals("Valid") && store4.equals("Valid"))
        {
            return printAllValid();
        }
        else
        {
            return printFinal();
        }
    }

    public static String printFinal()
    {
        System.out.println(outputStatement);
        return outputStatement;
    }

    public static String printAllValid()
    {
        String output = "There were no errors found.";
        System.out.println(output);
        return output;
    }

    public static String validateFirstName(String name)
    {
        if (name.length() == 0)
        {
            return printEmptyFirst();
        }
        else if (name.length() < 2)
        {
            return printShortFirst();
        }
        return "Valid";
    }

    public static String validateLastName(String name)
    {
        if (name.length() == 0)
        {
            return printEmptyLast();
        }
        else if (name.length() < 2)
        {
            return printShortLast();
        }
        return "Valid";
    }

    public static String printEmptyFirst()
    {
        String output = "The first name must be at least 2 characters long.\nThe first name must be filled in.\n";
        outputStatement = outputStatement + output;
        return output;
    }

    public static String printShortFirst()
    {
        String output = "The first name must be at least 2 characters long.\n";
        outputStatement = outputStatement + output;
        return output;
    }

    public static String printEmptyLast()
    {
        String output = "The last name must be at least 2 characters long.\nThe last name must be filled in.\n";
        outputStatement = outputStatement + output;
        return output;
    }

    public static String printShortLast()
    {
        String output = "The last name must be at least 2 characters long.\n";
        outputStatement = outputStatement + output;
        return output;
    }

    public static String validateZip(String zip)
    {
        char [] zipConvert = zip.toCharArray();
        boolean alpha = false;
        int i;

        for (i = 0; i < zipConvert.length; i++)
        {
            if (Character.isAlphabetic(zipConvert[i]))
            {
                alpha = true;
            }
        }

        if (alpha)
        {
            return printZipError();
        }
        else if (zip.length() != 5)
        {
            return printZipError();
        }

        return "Valid";
    }

    public static String printZipError()
    {
        String output = "The zipcode must be a 5 digit number.\n";
        outputStatement = outputStatement + output;
        return output;
    }

    public static String validateID(String ID)
    {
        String format = "[a-zA-Z]{2}[-][0-9]{4}";

        if(!Pattern.matches(format, ID))
        {
            return printEmpIDError();
        }

        return "Valid";
    }

    public static String printEmpIDError()
    {
        String output = "The employee ID must be in the format of AA-1234.\n";
        outputStatement = outputStatement + output;
        return output;
    }
}
