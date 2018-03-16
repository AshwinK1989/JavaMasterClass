package com.section6;

import java.util.Scanner;

public class SwitchStatementExercise {


    public static void printCharacters(char charValue) {


        switch (charValue) {

            case 'A': case 'B':case 'C':case 'D':case 'E':
                System.out.println("The char value is " + charValue);
                break;

            default:
                System.out.println("Cannot display value");
                break;


        }

    }

    public static void main(String[] args) {

        printCharacters(new Scanner(System.in).next().charAt(0));
    }
}
