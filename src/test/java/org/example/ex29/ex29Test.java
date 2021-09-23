/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jordan Snoap
 */

package org.example.ex29;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class ex29Test
{
    @Test
    public void checkDoublingTime()
    {
        assertEquals(18.0,ex29.calculateDoubleTime(4.0), .001);
        assertEquals(48.0,ex29.calculateDoubleTime(1.5), .001);
    }
}
