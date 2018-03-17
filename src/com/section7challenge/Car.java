package com.section7challenge;

public class Car extends Vehicle {

    private String steeringDirection;

    public Car(String name, String size,int speed, int wheels,String steeringDirection) {
        super(name, size, speed,wheels);
        this.steeringDirection=steeringDirection;
    }

    private void moveSteering (String steeringDirection) {

        System.out.println("Moving the steering to "+steeringDirection);
    }




}
