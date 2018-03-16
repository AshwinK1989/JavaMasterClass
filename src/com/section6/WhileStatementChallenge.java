package com.section6;

import java.util.Scanner;

public class WhileStatementChallenge {


    public static void main(String[] args) {

       boolean value =  isEvenNumber(new Scanner(System.in).nextInt());

        System.out.println("The number is even "+value);
    }

    public static boolean isEvenNumber (int number)  {


        while (number%2==0)  {

            return true;

        }

        return false;

    }
}
