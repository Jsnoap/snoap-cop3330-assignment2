/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jordan Snoap
 */

package org.example.ex27;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class ex27Test
{
    @Test
    public void checkValidation()
    {
        // Running this indirectly checks all other associated functions
        assertEquals("There were no errors found.", ex27.validateInput("John","Johnson", "55555", "TK-4321"));
    }

    @Test
    public void checkValidationWithError()
    {
        // Running this indirectly checks all other associated functions
        assertEquals("The first name must be at least 2 characters long.\nThe last name must be at least 2 characters long.\nThe last name must be filled in.\nThe employee ID must be in the format of AA-1234.\nThe zipcode must be a 5 digit number.\n", ex27.validateInput("J","", "ABCDE", "A12-1234"));
    }

    @Test
    public void extraTests()
    {
        // Running this indirectly checks all other associated functions
        assertEquals("Valid",ex27.validateFirstName("Jordan"));
        assertEquals("Valid",ex27.validateLastName("Snoap"));
        assertEquals("Valid",ex27.validateID("JS-1414"));

        assertEquals("The first name must be at least 2 characters long.\nThe first name must be filled in.\n",ex27.validateFirstName(""));
    }
}
