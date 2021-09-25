/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jordan Snoap
 */

package org.example.ex31;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class ex31Test
{
    @Test
    public void checkFindTargetHR()
    {
        assertEquals(191, ex31.findTargetHeartRate(22,65), .99);
        assertEquals(192, ex31.findTargetHeartRate(21,58), .99);
        assertEquals(151, ex31.findTargetHeartRate(65,70), .99);
    }
}
