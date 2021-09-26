/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jordan Snoap
 */

package org.example.ex33;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class ex33Test
{
    @Test
    public void checkMagicEightBall()
    {
        assertEquals("Yes",ex33.printResponse(0));
        assertEquals("No",ex33.printResponse(1));
        assertEquals("Maybe",ex33.printResponse(2));
        assertEquals("Ask again later.",ex33.printResponse(3));
    }
}
