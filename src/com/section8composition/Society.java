package com.section8composition;

public class Society {

    public static void main(String[] args) {

        Doors doors = new Doors(1,new DoorDimension(50,50));

        Windows windows = new Windows(2,new WindowDimension(20,30));

        Chair chair = new Chair(4);

        House house = new House(chair,doors,windows);

        house.closeDoor();
        house.openWindow();


    }

}
