/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jordan Snoap
 */

package org.example.ex34;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class ex34Test
{
    @Test
    public void checkRemoveName()
    {
        ArrayList<String> employees = new ArrayList<> (Arrays.asList("Chris Jones","John Smith"));

        assertEquals("Chris Jones", ex34.removeEmp("Chris Jones", employees));
    }

    @Test
    public void checkAddNames()
    {
        ArrayList<String> employees = new ArrayList<>();

        assertEquals(employees, ex34.arrayListForm(employees));
    }
}
