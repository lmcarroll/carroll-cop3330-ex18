/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Liam Carroll
 */

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        System.out.println("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.");
        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();

        int fahrenheit;
        int celsius;
        if (choice.equals("F")) {
            System.out.println("Please enter the temperature in Fahrenheit: ");
            input = new Scanner(System.in);
            fahrenheit = input.nextInt();

            celsius = (fahrenheit - 32) * 5 / 9;

            System.out.println("The temperature in celsius is " + celsius + ".");
        }
        if (choice.equals("C")) {
            System.out.println("Please enter the temperature in Celsius: ");
            input = new Scanner(System.in);
            celsius = input.nextInt();

            fahrenheit = (celsius * 9 / 5) + 32;

            System.out.println("The temperature in fahrenheit is " + fahrenheit + ".");
        }
    }
}
