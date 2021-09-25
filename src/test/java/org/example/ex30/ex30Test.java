/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jordan Snoap
 */

package org.example.ex30;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class ex30Test
{
    @Test
    public void checkDoublingTime()
    {
        // Function returns last multiple if successfully formed
        assertEquals(144, ex30.formMultTable());
    }
}
