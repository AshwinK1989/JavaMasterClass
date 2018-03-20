package com.section8composition;

public class Windows {

    private int numberOfWindows;
    private WindowDimension dimension;


    public Windows(int numberOfWindows,WindowDimension dimension ) {
        this.numberOfWindows = numberOfWindows;
        this.dimension=dimension;
    }


    public void openWindows () {

        System.out.println("Opening the Windows "+getNumberOfWindows());
    }

    public void closeWindows ()  {

        System.out.println("Closing the Windows "+getNumberOfWindows());

    }


    private int getNumberOfWindows() {
        return numberOfWindows;
    }
}
