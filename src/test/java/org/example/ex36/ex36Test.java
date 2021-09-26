/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jordan Snoap
 */

package org.example.ex36;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class ex36Test
{
    @Test
    public void checkAvg()
    {
        ArrayList<Double> testNums = new ArrayList<>(Arrays.asList(100.0,200.0,1000.0,300.0));
        assertEquals(400,ex36.average(testNums), .001);
    }

    @Test
    public void checkMin()
    {
        ArrayList<Double> testNums = new ArrayList<>(Arrays.asList(100.0,200.0,1000.0,300.0));
        assertEquals(100,ex36.min(testNums), .001);
    }

    @Test
    public void checkMax()
    {
        ArrayList<Double> testNums = new ArrayList<>(Arrays.asList(100.0,200.0,1000.0,300.0));
        assertEquals(1000,ex36.max(testNums), .001);
    }

    @Test
    public void checkStd()
    {
        ArrayList<Double> testNums = new ArrayList<>(Arrays.asList(100.0,200.0,1000.0,300.0));
        assertEquals(353.55,ex36.std(testNums), .1);
    }
}
