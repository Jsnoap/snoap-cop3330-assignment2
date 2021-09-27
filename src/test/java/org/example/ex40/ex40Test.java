/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jordan Snoap
 */

package org.example.ex40;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class ex40Test {

    @Test
    public void checkingMapAndList()
    {
        ArrayList<Map<Integer, String>> employeeData = new ArrayList<>();
        ArrayList<Integer> correctIndeces = new ArrayList<>(Arrays.asList(4,5));

        Map<Integer, String> first = new HashMap<>();
        Map<Integer, String> last = new HashMap<>();
        Map<Integer, String> pos = new HashMap<>();
        Map<Integer, String> date = new HashMap<>();

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

        employeeData.add(first);
        employeeData.add(last);
        employeeData.add(pos);
        employeeData.add(date);

        // Check that it outputs correct indeces
        assertEquals(correctIndeces, ex40.searchList("Jac",employeeData));
    }
}
