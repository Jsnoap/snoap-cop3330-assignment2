/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jordan Snoap
 */

package org.example.ex40;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class ex40 {

    // Program with search functionality to pull up information based on a provided search string
    // Works for the first and last name fields
    public static void main(String[] args)
    {
        // Creating Maps
        ArrayList<Map<Integer, String>> employeeData = new ArrayList<>();
        ArrayList<Integer> printIndeces;
        String searchWord;

        System.out.println("Enter a search string:");
        Scanner inputSearch = new Scanner(System.in);
        searchWord = inputSearch.nextLine();

        Map<Integer, String> firstName = new HashMap<>();
        Map<Integer, String> lastName = new HashMap<>();
        Map<Integer, String> position = new HashMap<>();
        Map<Integer, String> sepDate = new HashMap<>();

        inputData(firstName, lastName, position, sepDate);

        addToList(firstName, lastName, position, sepDate, employeeData);

        printIndeces = searchList(searchWord, employeeData);

        printSearch(printIndeces, employeeData);
    }

    public static void inputData(Map<Integer, String> first, Map<Integer, String> last, Map<Integer, String> pos, Map<Integer, String> date)
    {
        // First Name contents
        first.put(1, "John");
        first.put(2, "Tou");
        first.put(3, "Michaela");
        first.put(4, "Jake");
        first.put(5, "Jacquelyn");
        first.put(6, "Sally");

        // Last Name contents
        last.put(1, "Johnson");
        last.put(2, "Xiong");
        last.put(3, "Michaelson");
        last.put(4, "Jacobson");
        last.put(5, "Jackson");
        last.put(6, "Webber");

        // Position contents
        pos.put(1, "Manager");
        pos.put(2, "Software Engineer");
        pos.put(3, "District Manager");
        pos.put(4, "Programmer");
        pos.put(5, "DBA");
        pos.put(6, "Web Developer");

        // Separation Date contents
        date.put(1, "2016-12-31");
        date.put(2, "2016-10-05");
        date.put(3, "2015-12-19");
        date.put(4, "");
        date.put(5, "");
        date.put(6, "2015-12-18");
    }

    public static void addToList(Map<Integer, String> first, Map<Integer, String> last, Map<Integer, String> pos, Map<Integer, String> date, ArrayList<Map<Integer, String>> employees)
    {
        // Adding all maps to list
        employees.add(first);
        employees.add(last);
        employees.add(pos);
        employees.add(date);
    }

    public static ArrayList<Integer> searchList(String search, ArrayList<Map<Integer,String>> data)
    {
        int i;
        ArrayList<Integer> storeIndeces = new ArrayList<>();

        Map<Integer, String> first = data.get(0);
        Map<Integer, String> last = data.get(1);

        for (i = 1; i <= first.size(); i++)
        {
            if (first.get(i).contains(search) || last.get(i).contains(search))
            {
                storeIndeces.add(i);
            }
        }

        return storeIndeces;

    }

    public static void printSearch(ArrayList<Integer> correctIndeces, ArrayList<Map<Integer,String>> searchData)
    {
        int i;
        String fullName;

        Map<Integer, String> first = searchData.get(0);
        Map<Integer, String> last = searchData.get(1);
        Map<Integer, String> pos = searchData.get(2);
        Map<Integer, String> date = searchData.get(3);

        System.out.println("Name                | Position          | Separation Date");
        System.out.println("--------------------|-------------------|----------------");

        // Iterates through and prints each field with correct spacing
        for (i = 0; i < correctIndeces.size(); i++)
        {
            fullName = first.get(correctIndeces.get(i)) + " " + last.get(correctIndeces.get(i));
            System.out.printf("%-19s | %-17s | %s", fullName, pos.get(correctIndeces.get(i)), date.get(correctIndeces.get(i)));
            System.out.println();
        }
    }
}


