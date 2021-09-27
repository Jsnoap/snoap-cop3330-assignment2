/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jordan Snoap
 */

package org.example.ex37;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class ex37Test
{
    @Test
    public void checkReturnAsString()
    {
        ArrayList<Character> examplePass = new ArrayList<>(Arrays.asList('1','a','$','f','h','r','7','8'));
        assertEquals("1a$fhr78",ex37.returnPassAsString(examplePass));
    }

    @Test
    public void checkAssignAmountNums()
    {
        assertEquals(4, ex37.assignNumLetters(8,2,2));
        assertEquals(6, ex37.assignNumLetters(10,2,2));

        assertEquals(5, ex37.assignNumLetters(8,3,2));
        assertEquals(5, ex37.assignNumLetters(6,3,2));
    }
}
