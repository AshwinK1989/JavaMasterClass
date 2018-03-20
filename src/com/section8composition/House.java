package com.section8composition;

public class House {

    private Chair chair;
    private Doors doors;
    private Windows windows;


    public House(Chair chair, Doors doors, Windows windows) {
        this.chair = chair;
        this.doors = doors;
        this.windows = windows;
    }


    public void openDoor () {

        doors.openDoors();

    }

    public void openWindow () {

      windows.openWindows();
    }

    public void closeDoor () {

        doors.closeDoors();

    }

    public void closeWindow () {

        windows.closeWindows();

    }

}
