/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jordan Snoap
 */

package org.example.ex38;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
// import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class ex38Test {

    @Test
    public void checkCreateEvens()
    {
        char[] nums = {'1','2','3','4'};
        char[] evens = {'2','4'};

        assertArrayEquals(evens, ex38.filterEvenNumbers(nums));
    }

    @Test
    public void checkRemoveSpaces()
    {
        char[] nums = {'1','2','3','4'};

        assertArrayEquals(nums, ex38.createArrayAndRemoveSpaces("1 2 3 4"));
    }
}