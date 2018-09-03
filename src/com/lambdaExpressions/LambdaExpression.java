package com.lambdaExpressions;

interface B {

    void Print(String test);

}

//class Xyz implements  A {
//
//
//    @Override
//    public void Print() {
//
//        System.out.println("Hello");
//    }
//}

public class LambdaExpression {


    public static void main(String[] args) {

        B b = test-> System.out.println(test);

        b.Print("Hello");

    }

}

