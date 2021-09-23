/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jordan Snoap
 */

package org.example.ex28;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class ex28Test
{
    @Test
    public void checkSum()
    {
        int [] arr1 = {1,2,3,4,5};
        assertEquals(15, ex28.calculateSum(arr1));

        int [] arr2 = {10,10,10,10,10};
        assertEquals(50, ex28.calculateSum(arr2));

        int [] arr3 = {-1,-2,-3,-4,-5};
        assertEquals(-15, ex28.calculateSum(arr3));

        int [] arr4 = {0,0,0,0,0};
        assertEquals(0, ex28.calculateSum(arr4));
    }
}
