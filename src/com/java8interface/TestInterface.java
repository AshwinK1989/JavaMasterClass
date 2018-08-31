package com.java8interface;

public interface TestInterface {


      default int add (int x, int y) {

        return x+y;
    }

     static void print (String test) {

          System.out.println(test);
    }
}
