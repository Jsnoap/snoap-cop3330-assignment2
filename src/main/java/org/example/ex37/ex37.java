/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jordan Snoap
 */

package org.example.ex37;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ex37 {

    // Program to generate random password after prompting user for min length, amount of special chars, and amount of numbers
    public static void main(String[] args)
    {
        int minLen, numSpecial, numNumbers, numLetters;
        ArrayList<Character> passwordContents = new ArrayList<>();
        String password;

        System.out.println("What's the minimum length?");
        Scanner inputMin = new Scanner(System.in);
        minLen = inputMin.nextInt();

        System.out.println("How many special characters?");
        Scanner inputSpecial = new Scanner(System.in);
        numSpecial = inputSpecial.nextInt();

        System.out.println("How many numbers?");
        Scanner inputNum = new Scanner(System.in);
        numNumbers = inputNum.nextInt();

        numLetters = assignNumLetters(minLen, numSpecial, numNumbers);

        chooseLetters(numLetters, passwordContents);

        chooseSpecial(numSpecial, passwordContents);


        chooseNumbers(numNumbers, passwordContents);

        shufflePass(passwordContents);

        password = returnPassAsString(passwordContents);

        printPassword(password);
    }

    // Tells code how many extra letters are needed in the password
    public static int assignNumLetters(int minLength, int spec, int num)
    {
        int letterCount;

        letterCount = minLength - (spec + num);

        if (((spec + num) * 2) > minLength)
        {
            letterCount = (spec + num);
        }

        return letterCount;
    }

    // Adds proper amount of letters and puts in ArrayList
    public static void chooseLetters(int numLett, ArrayList<Character> password)
    {
        int i;
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        double rand = Math.random();
        int index;

        for (i = 0; i < numLett; i++)
        {
            index = (int)Math.floor(rand * 26);
            rand = Math.random();
            password.add(alphabet.charAt(index));
        }
    }

    // Adds proper amount of special characters and puts in ArrayList
    public static void chooseSpecial(int numSpec, ArrayList<Character> password)
    {
        int i;
        String specialChars ="!\"#$%&'()*+,-./:;<=>?@[]^_`{|}~";
        double rand = Math.random();
        int index;

        for (i = 0; i < numSpec; i++)
        {
            index = (int) Math.floor(rand * 31);
            rand = Math.random();
            password.add(specialChars.charAt(index));
        }
    }

    // Adds proper amount of numbers and puts in ArrayList
    public static void chooseNumbers(int numbers, ArrayList<Character> password)
    {
        int i;
        String numChoices ="0123456789";
        double rand = Math.random();
        int index;

        for (i = 0; i < numbers; i++)
        {
            index = (int) Math.floor(rand * 10);
            rand = Math.random();
            password.add(numChoices.charAt(index));
        }
    }

    public static void shufflePass(ArrayList<Character> pass)
    {
        // new method learned which mixes around contents of a list
        Collections.shuffle(pass);
    }

    public static String returnPassAsString(ArrayList<Character> pass)
    {
        String passString;

        // Changes list into String form
        StringBuilder finalPass = new StringBuilder();
        for (Character ch: pass)
        {
            finalPass.append(ch);
        }

        passString = finalPass.toString();

        return passString;
    }

    public static void printPassword(String pass)
    {
        System.out.println("Your password is " + pass);
    }
}
