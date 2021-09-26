/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jordan Snoap
 */

package org.example.ex35;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class ex35Test
{
    // All functions written except "pickWinner" only scan or print.
    // "pickWinner" will pick a random element of the ArrayList.
    @Test
    public void checkWinner()
    {
        ArrayList<String> people = new ArrayList<>(Arrays.asList("Jordan"));
        assertEquals("Jordan", ex35.pickWinner(people));
    }
}
