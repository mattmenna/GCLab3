package com.company;
/*
Prompt the user to enter an integer
Display a table of squares and cubes from 1 to the value entered
Ask if the user wants to continue
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
System.out.println("Learn your squares and cubes!");
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter an integer");
        int uInput = scnr.nextInt();

    }
    private static int square( int input) {
        int squareNum = Math.pow(input, 2)
        return squareNum
    }
}