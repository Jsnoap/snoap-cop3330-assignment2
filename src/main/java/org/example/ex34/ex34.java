/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jordan Snoap
 */

package org.example.ex34;
import java.util.Scanner;
import java.util.ArrayList;

public class ex34 {

    // Program to remove an entered name from a list of names
    // New java element: ArrayList - resizable array... similar to Hash Map
    public static void main(String[] args)
    {
        String removeEmployee;

        ArrayList<String> storeEmployees = new ArrayList<>();
        arrayListForm(storeEmployees);

        printEmployees(storeEmployees);

        System.out.println("Enter an employee name to remove:");
        Scanner inputRemove = new Scanner(System.in);
        removeEmployee = inputRemove.nextLine();

        removeEmp(removeEmployee, storeEmployees);

        printEmployees(storeEmployees);
    }

    public static ArrayList<String> arrayListForm(ArrayList<String> employees)
    {
        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");

        return employees;
    }

    public static void printEmployees(ArrayList<String> employees)
    {
        int i;

        System.out.println("There are " + employees.size() + " employees:");

        for (i = 0; i < employees.size(); i++)
        {
            System.out.println(employees.get(i));
        }
    }

    public static String removeEmp(String employee, ArrayList<String> empList)
    {
        empList.remove(employee);

        return employee;
    }

}
