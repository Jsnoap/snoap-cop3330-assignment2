/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jordan Snoap
 */

package org.example.ex25;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class ex25Test
{
    @Test
    public void checkPasswordChecking()
    {
        assertEquals(1, ex25.passwordValidator("12345"));
        assertEquals(2, ex25.passwordValidator("abcdef"));
        assertEquals(3, ex25.passwordValidator("abc123xyz"));
        assertEquals(4, ex25.passwordValidator("1337h@xor!"));
    }
}
