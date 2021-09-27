/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jordan Snoap
 */

package org.example.ex39;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class ex39 {

    // Program to take employees table in and sort by last name.
    // Also print results as a table
    public static void main(String[] args)
    {
        // Creating Maps
        ArrayList<Map<Integer, String>> employeeData = new ArrayList<>();
        ArrayList<Map<Integer, String>> sortedEmployeeData;

        Map<Integer, String> firstName = new HashMap<>();
        Map<Integer, String> lastName = new HashMap<>();
        Map<Integer, String> position = new HashMap<>();
        Map<Integer, String> sepDate = new HashMap<>();

        inputData(firstName, lastName, position, sepDate);

        addToList(firstName, lastName, position, sepDate, employeeData);

        sortedEmployeeData = sortByLastName(employeeData);

        printSorted(sortedEmployeeData);
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

    public static ArrayList<Map<Integer, String>> sortByLastName(ArrayList<Map<Integer, String>> allEmployeeData)
    {
        int i, j;
        String store;

        ArrayList<Map<Integer, String>> sort = new ArrayList<>();

        Map<Integer, String> first = allEmployeeData.get(0);
        Map<Integer, String> last = allEmployeeData.get(1);
        Map<Integer, String> pos = allEmployeeData.get(2);
        Map<Integer, String> date = allEmployeeData.get(3);

        // Loop iterates through and brings the earliest alphabetical last name to the top of the map in the sorted list
        for (i = 1; i <= last.size() - 1; i++)
        {
            for (j = i + 1; j <= last.size(); j++)
            {
                // compareTo() returns positive if first is larger, negative if second is, zero if equal
                if (last.get(i).compareTo(last.get(j)) > 0)
                {
                    store = last.get(i);
                    last.put(i, last.get(j));
                    last.put(j, store);

                    store = first.get(i);
                    first.put(i, first.get(j));
                    first.put(j, store);

                    store = pos.get(i);
                    pos.put(i, pos.get(j));
                    pos.put(j, store);

                    store = date.get(i);
                    date.put(i, date.get(j));
                    date.put(j, store);
                }
            }
        }

        // Add to new sorted List
        sort.add(first);
        sort.add(last);
        sort.add(pos);
        sort.add(date);

        return sort;
    }

    // Creates proper table format from sorted data
    public static void printSorted(ArrayList<Map<Integer,String>> sorted)
    {
        int i;
        String fullName;

        Map<Integer, String> first = sorted.get(0);
        Map<Integer, String> last = sorted.get(1);
        Map<Integer, String> pos = sorted.get(2);
        Map<Integer, String> date = sorted.get(3);

        System.out.println("Name                | Position          | Separation Date");
        System.out.println("--------------------|-------------------|----------------");

        // Iterates through and prints each field with correct spacing
        for (i = 1; i < last.size(); i++)
        {
            fullName = first.get(i) + " " + last.get(i);
            System.out.printf("%-19s | %-17s | %s", fullName, pos.get(i), date.get(i));
            System.out.println();
        }
    }
}
