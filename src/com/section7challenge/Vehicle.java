package com.section7challenge;

public class Vehicle {


    private String name;
    private String size;
    private int speed;
    private int wheels;



    public Vehicle(String name, String size, int speed,int wheels) {
        this.name = name;
        this.size = size;
        this.speed= speed;
        this.wheels=wheels;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getSpeed() {
        return speed;
    }

    public int getWheels() {
        return wheels;
    }
}
