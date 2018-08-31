package com.lambdaExpressions;

interface A {

   void Print();

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

public class LambdaDemoWithAnonymousInner {


    public static void main(String[] args) {

        A a = new A (){

            public void Print() {

                System.out.println("Hello");
            }

        };

        a.Print();

    }

}

