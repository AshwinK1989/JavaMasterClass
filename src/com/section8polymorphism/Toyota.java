package com.section8polymorphism;

public class Toyota extends Car {

    public Toyota(int numberOfCylinders, String name) {
        super(numberOfCylinders, name);
    }


    public void startEngine () {

        System.out.println("Start the Engine of "+super.getName() +" Car");
    }

    public void accelerate () {

        System.out.println("Accelerate the Car");

    }

    public void stopBrake () {

        System.out.println("Press the "+ super.getName()  +" brake");
    }

}
