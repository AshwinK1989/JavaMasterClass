package com.datatypes;

public class Operator {

    public static void main(String[] args) {

        double firstValue = 20d;
        double secondValue = 80d;
        double thirdValue = (firstValue + secondValue) * 25;
        double fourthValue = thirdValue % 40;
        if (fourthValue <= 20) {
            System.out.println("Total was over the limit");
        }
    }
}
