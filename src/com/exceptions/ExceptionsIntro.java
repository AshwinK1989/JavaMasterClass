package com.exceptions;

public class ExceptionsIntro {


    public static void main(String[] args) {


        divideEAFP(10,0);
        divideLBYL(10,0);
        divide(10,0);
    }


    private static int divideLBYL(int x, int y) {

        if(y!=0) {

            return x/y;
        }
        else {

            return 0;
        }
    }

    private static int divideEAFP(int x, int y) {

        try {

            return x/y;
        }
        catch (ArithmeticException e){

            return 0;
        }
    }

    private static int divide(int x, int y) {

            return x/y;
    }
}
