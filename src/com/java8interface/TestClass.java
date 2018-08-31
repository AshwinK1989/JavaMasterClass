package com.java8interface;

public class TestClass implements TestInterface {


    public static void main(String[] args) {

        TestInterface ti = new TestClass();

       System.out.println("The value of addition "+ti.add(2,3));

        TestInterface.print("Hello");
    }
}
