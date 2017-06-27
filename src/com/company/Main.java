package com.company;
/*
Prompt the user to enter an integer
Display a table of squares and cubes from 1 to the value entered
Ask if the user wants to continue

Formatted out is like magic need practice with that.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Learn your squares and cubes!");
        Scanner scnr = new Scanner(System.in);
        char cont;
        String output;

        do {
        System.out.println("Enter an integer");
        int uInput = scnr.nextInt();

        System.out.println("Number     " + "Squared    " + "Cubed      ");
        System.out.println("===========" + "===========" + "===========");

        for (int i=1; i<=uInput; i++){
            output = String.format("%-11d", i); // no decimal after 11 or exception is thrown 11 digits in width
            System.out.print(output);

            output = String.format("%-11.0f", square(i)); // f in format for double return type 11 in space left justified 0 digits after
            System.out.print(output);

            output = String.format("%-11.0f", cube(i));  // f in format for double return type
            System.out.println(output);
        }
        System.out.println("Do you want to continue? Please use y or n");
        cont = scnr.next().charAt(0);

    } while (cont != 'n');

    } // end Main

    private static double square(int input) {
        double squareNum = Math.pow(input, 2);
        return squareNum;
    }

    private static double cube(int input) {
        double cubeNum = Math.pow(input, 3);
        return cubeNum;
    }

}