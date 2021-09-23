/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jordan Snoap
 */

package org.example.ex26;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class ex26Test
{
    @Test
    public void calculateMonths()
    {
        PaymentCalculator a = new PaymentCalculator(5000.0, 12.0, 100.0);

        assertEquals(70,a.calculateMonthsUntilPaidOff(),.001);
    }
}
