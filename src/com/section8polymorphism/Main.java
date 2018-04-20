package com.section8polymorphism;

public class Main {

    public static void main(String[] args) {

     Car car = new Toyota(5,"Toyota");
     car.startEngine();
     car.accelerate();
     car.stopBrake();

    }
}
