package com.section7challenge;

public class Toyota extends Car  {


    public Toyota( int speed, int wheels, String steeringDirection) {
        super("Corolla", "Medium", speed, wheels, steeringDirection);
    }


    @Override
    public int getSpeed() {

        return getToyotaSpeed(super.getSpeed());

    }


    private int getToyotaSpeed (int speed) {

        if(speed>220) {

            System.out.println("You cannot speed up more than 220");
        }
        else {
            return speed;
        }

        return -1;

    }
}
