package com.section6;

import java.util.Scanner;

public class SwitchStatements {


    public static void switchStatements(int switchValue) {

        switch (switchValue) {
            case 1:
                System.out.println("The value is " + switchValue);

                break;

            case 2:
            case 3:
            case 4:
                System.out.println("The value can 2, 3 or 4 " + switchValue);

                break;

            default:
                System.out.println("The default value " + switchValue);

                break;
        }

    }

    public static void main(String[] args) {

        switchStatements(new Scanner(System.in).nextInt());
    }
}
