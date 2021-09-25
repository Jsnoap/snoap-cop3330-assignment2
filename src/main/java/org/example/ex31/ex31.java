/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jordan Snoap
 */

package org.example.ex31;
import java.util.Scanner;

public class ex31 {

    public static void main(String[] args)
    {
        double age, heartRate;

        System.out.println("How old are you?");
        Scanner inputAge = new Scanner(System.in);
        age = inputAge.nextDouble();

        System.out.println("What is your resting heart rate?");
        Scanner inputHR = new Scanner(System.in);
        heartRate = inputHR.nextDouble();

        findTargetHeartRate(age, heartRate);
    }

    public static double findTargetHeartRate(double age, double restingHR)
    {
        double TargetHeartRate;
        double intensity;
        double storeLast = 0;

        printTableHeader(age, restingHR);

        for (intensity = .55; intensity < 1; intensity += .05)
        {
            TargetHeartRate = ((220 - age) - restingHR) * intensity + restingHR;
            printTableContent(intensity, TargetHeartRate);
            storeLast = TargetHeartRate;
        }

        return storeLast;
    }

    public static void printTableHeader(double age, double restingHR)
    {
        System.out.println("Resting Pulse: " + String.format("%.0f",restingHR) + "        Age: "+ String.format("%.0f",age) + "\n");
        System.out.println("Intensity    | Rate");
        System.out.println("-------------|--------");
    }

    public static void printTableContent(double intensity, double targetHR)
    {
        double intensityPercent = intensity * 100;

        System.out.println(String.format("%.0f",intensityPercent) + "%          | "+ String.format("%.0f",targetHR) + " bpm");
    }


}