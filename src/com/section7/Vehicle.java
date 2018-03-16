package com.section7;

public class Vehicle {


    public static void main(String[] args) {

        Car toyota = new Car();
        toyota.setModel("Etios");
        System.out.println("The model is "+toyota.getModel());
        toyota.setModel("Corolla");
        System.out.println("The model is "+toyota.getModel());


    }
}
