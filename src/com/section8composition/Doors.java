package com.section8composition;

public class Doors {

    private int numberOfDoors;
    private DoorDimension dimension;


    public Doors(int numberOfDoors,DoorDimension dimension ) {
        this.numberOfDoors = numberOfDoors;
        this.dimension=dimension;
    }


    public void openDoors () {

        System.out.println("Opening the door "+getNumberOfDoors());
    }

    public void closeDoors ()  {

        System.out.println("Closing the door "+getNumberOfDoors());

    }


    private int getNumberOfDoors() {
        return numberOfDoors;
    }
}
