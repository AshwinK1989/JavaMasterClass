package com.section5;

public class VariableAccess {

    public static void main(String[] args) {

      //Lecture: 26 The variable surname cannot be accessed outside the if block.
        String name ="ashwin";

        if(true) {

            System.out.println("The name is "+name);
            String surname = "karangutkar";
        }

        System.out.println("The surname is "+surname);

        if (true) {

            String surname ="karangutkar";
            System.out.println("The surname is "+surname);

        }

    }
}
