package com.KjetilBjelldokken;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner readInString = new Scanner(System.in);

        //Print out a message to tell what the user should write in, and read in string.
        System.out.println("Write in +, -, * or / depending of what operation you want to do");
        String operator = readInString.nextLine();

        //Print out to ask for first number and then read in.
        System.out.println("Write in the first number");
        int a = readInString.nextInt();

        //ask for second nr and read in
        System.out.println("Write in the second number");
        int b = readInString.nextInt();

        // Checks which operator was scanned and print out the result based on the operator
        if (operator.equals("+")) {
            System.out.println("a + b = " + (a + b));
        } else if (operator.equals("-")) {
            System.out.println("a - b = " + (a - b));
        } else if (operator.equals("*")) {
            System.out.println("a * b = " + (a * b));
        } else if (operator.equals("/")) {
            System.out.println("a / b = " + (a / b));
        } else {
            System.out.println("Not the operator we want");
        }
    }
}

