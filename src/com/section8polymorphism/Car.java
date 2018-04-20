package com.section8polymorphism;

public class Car {

    private int numberOfCylinders;
    private boolean numberOfEngines;
    private int numberOfWheels;
    private String name;


    public Car(int numberOfCylinders,String name) {
        this.numberOfCylinders = numberOfCylinders;
        this.numberOfEngines = true;
        this.numberOfWheels = 4;
        this.name=name;
    }

    public int getNumberOfCylinders() {

        System.out.println("The number of cylinders "+numberOfCylinders);
        return numberOfCylinders;
    }

    public boolean isNumberOfEngines() {

        System.out.println("The number of engines "+numberOfEngines);
        return numberOfEngines;
    }

    public int getNumberOfWheels() {

        System.out.println("The number of wheels "+numberOfWheels);
        return numberOfWheels;
    }

    public String getName() {
        return name;
    }

    public void startEngine () {

        System.out.println("Start the Engine of Car");
    }

    public void accelerate () {

        System.out.println("Accelerate the Car");
    }

    public void stopBrake () {

        System.out.println("Press the brake");
    }

}
